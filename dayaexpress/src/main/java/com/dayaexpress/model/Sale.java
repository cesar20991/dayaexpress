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
public class Sale {
	
	@Id @GeneratedValue @Column(name = "idsale")	
	private Integer idSale;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	
	@Column(name = "year", length = 4, nullable = false)
	private String year;
	
	@Column(name = "period", length = 2, nullable = false)
	private String period;
	
	@Column(name = "movementdate", nullable = false)
	private Timestamp movementDate;
	
	@Column(name = "subtotal", nullable = true)
	private Double subTotal;
	
	@Column(name = "dscto", nullable = true)
	private Double dscto;
	
	@Column(name = "iva", nullable = true)
	private Double iva;
	
	@Column(name = "grandtotal", nullable = true)
	private Double grandTotal;
	
	@Column(name = "creationdate", nullable = false)
	private Timestamp creationDate;
	
	@Column(name = "state", length = 10, nullable = false)
	private String state;
	
	@ManyToOne
	@JoinColumn(name = "idpublishing")
	private Publishing salePublishing;
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User saleUser;
	
	@OneToMany(mappedBy="sale")
	private Collection<Saledetail> saledetails;

	public Integer getIdSale() {
		return idSale;
	}

	public void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Timestamp getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(Timestamp movementDate) {
		this.movementDate = movementDate;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getDscto() {
		return dscto;
	}

	public void setDscto(Double dscto) {
		this.dscto = dscto;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
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

	public Publishing getSalePublishing() {
		return salePublishing;
	}

	public void setSalePublishing(Publishing salePublishing) {
		this.salePublishing = salePublishing;
	}

	public User getSaleUser() {
		return saleUser;
	}

	public void setSaleUser(User saleUser) {
		this.saleUser = saleUser;
	}

	public Collection<Saledetail> getSaledetails() {
		return saledetails;
	}

	public void setSaledetails(Collection<Saledetail> saledetails) {
		this.saledetails = saledetails;
	}
	

}
