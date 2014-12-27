package com.dayaexpress.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Publishing {
	
	@Id @GeneratedValue @Column(name = "idpublishing")	
	private Integer idPublishing;
	
	@Column(name = "type", length = 20, nullable = false)
	private String type;
	
	@Column(name = "title", length = 100, nullable = false)
	private String title;
	
	@Column(name = "description", length = 500, nullable = false)
	private String description;
	
	@Column(name = "tag", length = 100, nullable = true)
	private String tag;
	
	@Column(name = "dscto", nullable = true)
	private Double dscto;
	
	@Column(name = "total", nullable = false)
	private Double total; //total price
	
	@Column(name = "idCompany", nullable = false)
	private Integer idCompany;
	
	@Column(name = "creationdate", nullable = false)
	private Timestamp creationDate;
	
	@Column(name = "state", length = 10, nullable = false)
	private String state;
	
	//references
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User publiUser;
	
	@OneToMany(mappedBy="publishing")
	private Collection<Publishingdetail> publishingdetails;
	
	@OneToMany(mappedBy="salePublishing")
	private Collection<Sale> publishingSales;

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

	public User getPubliUser() {
		return publiUser;
	}

	public void setPubliUser(User publiUser) {
		this.publiUser = publiUser;
	}

	public Collection<Publishingdetail> getPublishingdetails() {
		return publishingdetails;
	}

	public void setPublishingdetails(Collection<Publishingdetail> publishingdetails) {
		this.publishingdetails = publishingdetails;
	}

	public Collection<Sale> getPublishingSales() {
		return publishingSales;
	}

	public void setPublishingSales(Collection<Sale> publishingSales) {
		this.publishingSales = publishingSales;
	}
	
	

}
