package com.dayaexpress.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id @GeneratedValue @Column(name = "idcategory")	
	private Integer idCategory;
	
	@Column(name = "namecategory", length = 30, nullable = false)
	private String nameCategory;
	
	@Column(name = "shortname", length = 10, nullable = true)
	private String shortName;
	
	@OneToMany(mappedBy="blogCategory")
	private Collection<Blog> categoryblogs;
	
	@OneToMany(mappedBy="wishCategory")
	private Collection<Wish> categorywishes;

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Collection<Blog> getCategoryblogs() {
		return categoryblogs;
	}

	public void setCategoryblogs(Collection<Blog> categoryblogs) {
		this.categoryblogs = categoryblogs;
	}

	public Collection<Wish> getCategorywishes() {
		return categorywishes;
	}

	public void setCategorywishes(Collection<Wish> categorywishes) {
		this.categorywishes = categorywishes;
	}
	
	

}
