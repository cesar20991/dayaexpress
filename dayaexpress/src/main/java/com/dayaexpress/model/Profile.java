package com.dayaexpress.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.dayaexpress.model.User;

@Entity
public class Profile {
	@Id @GeneratedValue @Column(name = "idprofile")
	private Integer idProfile;
	
	@Column(name = "name", length = 70, nullable = false)
	private String name;
	
	@Column(name = "lastname", length = 70, nullable = false)
	private String lastname;
	
	@Column(name = "typeidentify", length = 20, nullable = true)
	private String typeIdentify;
	
	@Column(name = "nroidentify", nullable = true)
	private Integer nroIdentify;
	
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

	public Integer getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTypeIdentify() {
		return typeIdentify;
	}

	public void setTypeIdentify(String typeIdentify) {
		this.typeIdentify = typeIdentify;
	}

	public Integer getNroIdentify() {
		return nroIdentify;
	}

	public void setNroIdentify(Integer nroIdentify) {
		this.nroIdentify = nroIdentify;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getBirth() {
		return birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	public String getPrimaryTel() {
		return primaryTel;
	}

	public void setPrimaryTel(String primaryTel) {
		this.primaryTel = primaryTel;
	}

	public String getSecondaryTel() {
		return secondaryTel;
	}

	public void setSecondaryTel(String secondaryTel) {
		this.secondaryTel = secondaryTel;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	//-------------------------------------------------------------------------------------------
	
	

	
	
}
