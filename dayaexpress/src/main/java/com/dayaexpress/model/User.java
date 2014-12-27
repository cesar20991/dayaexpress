package com.dayaexpress.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User {
	
	@Id @GeneratedValue @Column(name = "idusuario")	
	private Integer idUsuario;
	
	@Column(name = "email",length = 60, nullable = false)
	private String email;
	
	@Column(name = "password",length = 50, nullable = false)
	private String password;
	
	@Column(name = "creationdate", nullable = false)
	private Timestamp creationDate;
	
	@Column(name = "state",length = 10, nullable = false)
	private String state;
	
	//references
	
	@OneToOne(mappedBy="user")
	private Profile persona;
	
	@OneToMany(mappedBy="publiUser")
	private Collection<Publishing> userPublishing;
	
	@OneToMany(mappedBy="blogUser")
	private Collection<Blog> userBlogs;
	
	@OneToMany(mappedBy="saleUser")
	private Collection<Sale> userSales;
	
	@OneToMany(mappedBy="productUser")
	private Collection<Product> userProducts;
	
}
