package com.dayaexpress.form;

import java.sql.Timestamp;

public class PersonaBean {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String telefono;
	private String email;
	private String password;
	
	//
	private Integer idProfile;
	private String name;
	private String lastname;
	private String typeIdentify;
	private Integer nroIdentify;
	private String country;
	private Timestamp birth;
	private String primaryTel;
	private String secondaryTel;
	private String role;
	private String state;
	//
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
}
