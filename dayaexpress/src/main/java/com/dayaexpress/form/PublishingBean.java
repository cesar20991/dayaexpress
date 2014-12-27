package com.dayaexpress.form;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PublishingBean {
	
	private Integer idPublishing;
	private String type;
	private String title;
	private String description;
	private String tag;
	private Double dscto;
	private Double total;
	private Integer idCompany;
	private Timestamp creationDate;
	private String state;
	
	public Integer getIdPublishing() {
		return idPublishing;
	}
	public void setIdPublishing(Integer idPublishing) {
		this.idPublishing = idPublishing;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Double getDscto() {
		return dscto;
	}
	public void setDscto(Double dscto) {
		this.dscto = dscto;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
