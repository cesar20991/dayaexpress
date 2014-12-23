package com.savmepap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Blob;
import java.util.Collection;

@Entity
@Table(name = "\"company\"")
public class Company {
	
	@Id @GeneratedValue @Column(name = "idcompany")	
	private Integer idCompany;
	
	@Column(name = "code", length = 30, nullable = false)
	private String code;
	
	@Column(name = "companyname", length = 50, nullable = false)
	private String companyName;
	
	@Column(name = "address", length = 200, nullable = true)
	private String address;
	
	@Column(name = "telephone", length = 20, nullable = true)
	private String telephone;
	
	@Column(name = "logo", length = 20, nullable = true)
	private Blob logo;
	
	@Column(name = "state", length = 20, nullable = false)
	private String state;
	
	//references
	@OneToMany(mappedBy="company")
	private Collection<Profile> companyprofiles;

}
