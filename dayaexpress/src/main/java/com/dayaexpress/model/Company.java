package com.dayaexpress.model;

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
	
	@Column(name = "logo", nullable = true)
	private Blob logo;
	
	@Column(name = "state", length = 20, nullable = false)
	private String state;
	
	//references
	@OneToMany(mappedBy="company")
	private Collection<Profile> companyprofiles;

	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Blob getLogo() {
		return logo;
	}

	public void setLogo(Blob logo) {
		this.logo = logo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Collection<Profile> getCompanyprofiles() {
		return companyprofiles;
	}

	public void setCompanyprofiles(Collection<Profile> companyprofiles) {
		this.companyprofiles = companyprofiles;
	}
	
	

}
