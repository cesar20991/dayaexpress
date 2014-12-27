package com.dayaexpress.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Publishingdetail {

	@Id @GeneratedValue @Column(name = "iddetailp")	
	private Integer idDetailp;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	
	@Column(name = "dsctounit", nullable = true)
	private Double dsctoUnit;
	
	@Column(name = "price", nullable = true)
	private Double price;
	
	//Reference
	
	@ManyToOne
	@JoinColumn(name = "idpublishing")
	private Publishing publishing;
	
	@ManyToOne
	@JoinColumn(name = "idproduct")
	private Product product;

	public Integer getIdDetailp() {
		return idDetailp;
	}

	public void setIdDetailp(Integer idDetailp) {
		this.idDetailp = idDetailp;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getDsctoUnit() {
		return dsctoUnit;
	}

	public void setDsctoUnit(Double dsctoUnit) {
		this.dsctoUnit = dsctoUnit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Publishing getPublishing() {
		return publishing;
	}

	public void setPublishing(Publishing publishing) {
		this.publishing = publishing;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
