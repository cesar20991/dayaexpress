<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Pagina Principal</title>

<!-- Core CSS - Include with every page -->
<link href="styles/bootstrap.min.css" rel="stylesheet">
<link href="styles/font-awesome/css/font-awesome.css" rel="stylesheet">

<!-- Page-Level Plugin CSS - Dashboard -->
<link href="styles/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
<link href="styles/plugins/timeline/timeline.css" rel="stylesheet">

<!-- SB Admin CSS - Include with every page -->
<link href="styles/sb-admin.css" rel="stylesheet">

<!-- Core Scripts - Include with every page -->
<!-- <script src="js/jquery-1.10.2.js"></script> -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

<!-- Page-Level Plugin Scripts - Dashboard -->
<script src="js/plugins/morris/raphael-2.1.0.min.js"></script>
<!-- <script src="js/plugins/morris/morris.js"></script> -->

<!-- SB Admin Scripts - Include with every page -->
<script src="js/sb-admin.js"></script>

<!-- Page-Level Demo Scripts - Dashboard - Use for reference -->
<!-- <script src="js/demo/dashboard-demo.js"></script> -->
</head>
<script>
/* Script para inicializar para Pagina con la informacion*/
$(document).ready(function(e){
	InitInformacionPerfil();
});
// Ajax para Traer Informacion de Persona
function InitInformacionPerfil(){
	$.ajax({
 		url: 'getInformacionPerfil',
 		type: 'post',
 		dataType: 'json',
 		data: '',
 		success: function(personabean){
 			$("#enbNombre").val(personabean.nombre);
 			$("#enbApellPaterno").val(personabean.apellidoPaterno);
 			$("#enbApellMaterno").val(personabean.apellidoMaterno);
 			$("#enbTelefono").val(personabean.telefono);
 			$("#enbEmail").val(personabean.email);
 		}
 	});	
}
// Ajax para Editar Persona
function ExtractInformacion(){
		$('.vistaPerfil').hide();
		$('.edicionPerfil').show();
		$('#btnVerInformacion').show();
		$('#btnVerEdicion').hide();
		//
		$("#txtNombre").val($("#enbNombre").val());
		$("#txtApellPaterno").val($("#enbApellPaterno").val());
		$("#txtApellMaterno").val($("#enbApellMaterno").val());
		$("#txtTelefono").val($("#enbTelefono").val());
		$("#txtEmail").val($("#enbEmail").val());
}
function EditInformacionPerfil(){
	$.ajax({
   		url: 'ajaxEditInformacionPerfil',
   		type: 'post',
   		dataType: 'json',
   		data: $('#frmPersona').serialize(),
   		success: function(personabean){
   			$("#enbNombre").val(personabean.nombre);
 			$("#enbApellPaterno").val(personabean.apellidoPaterno);
 			$("#enbApellMaterno").val(personabean.apellidoMaterno);
 			$("#enbTelefono").val(personabean.telefono);
 			$("#enbEmail").val(personabean.email);
 			$('.vistaPerfil').show();
 			$('.edicionPerfil').hide();
 			$('#btnVerInformacion').hide();
 			$('#btnVerEdicion').show();
   		}
   	});
}
</script>

<body>

	<div id="wrapper">

		<jsp:include page="componentes/cabecera.jsp" />

		<jsp:include page="componentes/menu.jsp" />

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Mi Perfil</h1>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							Mis Datos Personales
							<div class="pull-right">
								<div class="btn-group">
									<span id="btnVerEdicion" class="btn btn-default btn-xs dropdown-toggle" onclick="ExtractInformacion();">Editar</span>
									<span id="btnVerInformacion" class="btn btn-default btn-xs dropdown-toggle" onclick="$('.vistaPerfil').show();$('.edicionPerfil').hide();$('#btnVerInformacion').hide();$('#btnVerEdicion').show();" style="display:none">Regresar</span>
								</div>
							</div>
						</div>
						<div class="panel-body">
							<div class="row vistaPerfil">
								<div class="col-lg-6">
										<div class="form-group">
											<label> Nombre</label>
											<input id="enbNombre" class="form-control" type="text" disabled="" placeholder="Nombre"></input>
										</div>
										<div class="form-group">
											<label> Apellido Paterno</label>
											<input id="enbApellPaterno" class="form-control" type="text" disabled="" placeholder="Apellido Paterno"></input>
										</div>
										<div class="form-group">
											<label> Apellido Materno</label>
											<input id="enbApellMaterno" class="form-control" type="text" disabled="" placeholder="Apellido Materno"></input>
										</div>
										<div class="form-group">
											<label> Telefono</label>
											<input id="enbTelefono" class="form-control" type="text" disabled="" placeholder="Telefono"></input>
										</div>
										<div class="form-group">
											<label> Email</label>
											<div class="form-group input-group">
												<span class="input-group-addon">@</span>
												<input id="enbEmail" class="form-control" type="text" disabled="" placeholder="Email"></input>
											</div>
										</div>
								</div>
							</div>
							<div class="row edicionPerfil" style="display:none">
								<div class="col-lg-6">
									<form id="frmPersona" role="form" commandName="persona">
										<div class="form-group">
											<label> Nombre</label> <input id ="txtNombre" class="form-control" name="nombre"
												placeholder="Nombre"></input>
										</div>
										<div class="form-group">
											<label> Apellido Paterno</label> <input id="txtApellPaterno" class="form-control" name="apellidoPaterno"
												placeholder="Apellido Paterno"></input>
										</div>
										<div class="form-group">
											<label> Apellido Materno</label> <input id="txtApellMaterno" class="form-control" name="apellidoMaterno"
												placeholder="Apellido Materno"></input>
										</div>
										<div class="form-group">
											<label> Telefono</label> <input id="txtTelefono" class="form-control" name="telefono"
												placeholder="Telefono"></input>
										</div>
										<div class="form-group">
											<label> Email</label>
											<div class="form-group input-group">
												<span class="input-group-addon">@</span>
												<input id="txtEmail" class="form-control" name="email"	placeholder="Email"></input>
											</div>	
										</div>
										<span class="btn btn-success" onclick="EditInformacionPerfil();">Guardar</span>
										<span class="btn btn-danger" 
											onclick="$('.vistaPerfil').show();$('.edicionPerfil').hide();$('#btnVerInformacion').hide();$('#btnVerEdicion').show();">Cancelar</span>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>
	<!-- /#wrapper -->



</body>

</html>
