package com.savmepap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Blog {

	@Id @GeneratedValue @Column(name = "idblog")	
	private Integer idBlog;
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User blogUser;
	
}
