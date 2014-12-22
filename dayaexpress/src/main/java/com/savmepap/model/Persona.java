package com.savmepap.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.savmepap.model.Usuario;

@Entity
public class Persona {
	@Id @GeneratedValue @Column(name = "idpersona")
	private Integer idPersona;
	
	@Column(name = "nombres", length = 70, nullable = false)
	private String nombres;
	
	@Column(name = "apellidos", length = 70, nullable = false)
	private String apellidos;
	
	@Column(name = "dni", length = 8, nullable = true)
	private Integer dni;
	
	@Column(name = "pais", length = 50, nullable = true)
	private String pais;
	
	@Column(name = "fechanacimiento", nullable = false)
	private Timestamp fechanacimiento;
	
	@Column(name = "telefono", length = 20, nullable = false)
	private String telefono;
	
	@Column(name = "estado", length = 10, nullable = false)
	private String estado;
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idusuario", nullable = false)
	private Usuario usuario;

	//-------------------------------------------------------------------------------------------
	
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Timestamp getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Timestamp fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
