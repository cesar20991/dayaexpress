package com.dayaexpress.form;

import java.sql.Timestamp;

public class SaleBean {
	
	private Integer idSale;
	private String code;
	private String year;
	private String period;
	private Timestamp movementDate;
	private Double subTotal;
	private Double dscto;
	private Double iva;
	private Double grandTotal;
	private Timestamp creationDate;
	private String state;
	
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

	
}
