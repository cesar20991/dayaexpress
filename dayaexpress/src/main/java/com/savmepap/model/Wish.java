package com.savmepap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Wish {

	@Id @GeneratedValue @Column(name = "idwish")	
	private Integer idWish;
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User wishUser;
	
}
