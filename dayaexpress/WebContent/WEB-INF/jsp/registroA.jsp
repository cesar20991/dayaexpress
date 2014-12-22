<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Pagina de Inicio</title>

<!-- Core CSS - Include with every page -->
<link href="styles/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<!-- SB Admin CSS - Include with every page -->
<link href="styles/sb-admin.css" rel="stylesheet">

</head>
<style>
label.error {
	margin-left: 10px;
	width: auto;
	display: inline;
	color: rgb(255, 0, 0);
	font-weight: bold;
}
</style>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Registro</h3>
					</div>
					<div class="panel-body">
						<form role="form" id="frmRegistro" action="registro" method="post"
							commandName="personabean">
							<fieldset>
								<div class="form-group">
									<label> Nombre</label> <input id="txtNombre"
										class="form-control" name="nombre" placeholder="Nombre"></input>
								</div>
								<div class="form-group">
									<label> Apellido Paterno</label> <input id="txtApellPaterno"
										class="form-control" name="apellidoPaterno"
										placeholder="Apellido Paterno"></input>
								</div>
								<div class="form-group">
									<label> Apellido Materno</label> <input id="txtApellMaterno"
										class="form-control" name="apellidoMaterno"
										placeholder="Apellido Materno"></input>
								</div>
								<div class="form-group">
									<label> Telefono</label> <input id="txtTelefono"
										class="form-control" name="telefono" placeholder="Telefono"></input>
								</div>
								<div class="form-group">
									<label> Email</label>
									<div class="form-group input-group">
										<span class="input-group-addon">@</span> <input id="txtEmail"
											class="form-control" name="email" placeholder="Email"></input>
									</div>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="password" type="password" value="" required>
								</div>
								<!-- Change this to a button or input when using this as a form -->
								<input class="btn btn-lg btn-success btn-block" type="submit"
									value="Registrar" />
								<p>
									<label class="error"><c:out value="${msg}" /></label>
								</p>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Core Scripts - Include with every page -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

	<!-- SB Admin Scripts - Include with every page -->
	<script src="js/sb-admin.js"></script>

</body>

</html>
