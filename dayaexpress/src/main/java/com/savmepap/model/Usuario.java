package com.savmepap.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	
	@Id @GeneratedValue @Column(name = "idusuario")	
	private Integer idUsuario;
	
	@Column(length = 60, nullable = false)
	private String email;
	
	@Column(length = 50, nullable = false)
	private String password;
	
	@Column(name = "fechacreacion", nullable = true)
	private Timestamp fechaCreacion;
	
	@Column(name = "activo", nullable = true)
	private Boolean activo;
	
	@OneToOne(mappedBy="usuario")
	private Persona persona;
	
	//-------------------------------------------------------------------------------------
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
