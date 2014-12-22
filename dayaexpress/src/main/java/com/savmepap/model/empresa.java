package com.savmepap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class empresa {
	
	@Id @GeneratedValue @Column(name = "idempresa")	
	private Integer idEmpresa;
	
	@Column(name = "codigo", length = 50, nullable = false)
	private String codigo;
	
	@Column(name = "rsocial", length = 50, nullable = false)
	private String rsocial;
	
	@Column(name = "direccion", length = 200, nullable = false)
	private String direccion;
	

}
