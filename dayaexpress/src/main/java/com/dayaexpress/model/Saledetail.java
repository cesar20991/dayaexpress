package com.dayaexpress.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Saledetail {

	@Id @GeneratedValue @Column(name = "iddetails")	
	private Integer idDetails;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	
	@Column(name = "unitcost", nullable = false)
	private Double unitCost;
	
	@Column(name = "dsctounit", nullable = true)
	private Double dsctoUnit;
	
	@Column(name = "total", nullable = false)
	private Double total;
	
	@ManyToOne
	@JoinColumn(name = "idsale")
	private Sale sale;
	
	@ManyToOne
	@JoinColumn(name = "idproduct")
	private Product saleProduct;
	
}
