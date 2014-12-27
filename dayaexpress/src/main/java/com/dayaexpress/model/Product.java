package com.dayaexpress.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id @GeneratedValue @Column(name = "idproduct")	
	private Integer idProduct;
	
	@Column(name = "type", length = 20, nullable = false)
	private String type;
	
	//References
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User productUser;

	@OneToMany(mappedBy="product")
	private Collection<Publishingdetail> productdetails;
	
	@OneToMany(mappedBy="saleProduct")
	private Collection<Saledetail> saleProducts;

	
}
