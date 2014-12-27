package com.dayaexpress.form;

import java.sql.Blob;

public class CompanyBean {

	private Integer idCompany;
	private String code;
	private String companyName;
	private String address;
	private String telephone;
	private Blob logo;
	private String state;
	
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
	
	

}
