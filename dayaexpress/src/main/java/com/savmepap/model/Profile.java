package com.savmepap.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.savmepap.model.User;

@Entity
public class Profile {
	@Id @GeneratedValue @Column(name = "idprofile")
	private Integer idProfile;
	
	@Column(name = "name", length = 70, nullable = false)
	private String name;
	
	@Column(name = "lastname", length = 70, nullable = false)
	private String lastname;
	
	@Column(name = "typeidentify", length = 20, nullable = true)
	private String typeidentify;
	
	@Column(name = "nroidentify", nullable = true)
	private Integer nroidentify;
	
	@Column(name = "country", length = 50, nullable = true)
	private String country;
	
	@Column(name = "birth", nullable = false)
	private Timestamp birth;
	
	@Column(name = "primarytel", length = 30, nullable = false)
	private String primaryTel;
	
	@Column(name = "secondarytel", length = 30, nullable = true)
	private String secondaryTel;
	
	@Column(name = "role", length = 20, nullable = false)
	private String role;
	
	@Column(name = "state", length = 10, nullable = false)
	private String state;
	
	//references
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iduser", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "idcompany")
	private Company company;

	//-------------------------------------------------------------------------------------------
	
	

	
	
}
