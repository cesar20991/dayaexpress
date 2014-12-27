package com.dayaexpress.model;

import java.sql.Timestamp;

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
	
	@Column(name = "title", length = 50, nullable = false)
	private String title;
	
	@Column(name = "descriptionwish", nullable = false)
	private String descriptionWish;
	
	@Column(name = "creationdate", nullable = false)
	private Timestamp creationDate;
	
	@Column(name = "state", length = 10, nullable = false)
	private String state;
	
	@Column(name = "tag", length = 100, nullable = true)
	private String tag;
	
	@Column(name = "year", length = 4, nullable = false)
	private String year;
	
	@Column(name = "period", length = 2, nullable = false)
	private String period;
	
	//References
	
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User wishUser;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category wishCategory;

	public Integer getIdWish() {
		return idWish;
	}

	public void setIdWish(Integer idWish) {
		this.idWish = idWish;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescriptionWish() {
		return descriptionWish;
	}

	public void setDescriptionWish(String descriptionWish) {
		this.descriptionWish = descriptionWish;
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public User getWishUser() {
		return wishUser;
	}

	public void setWishUser(User wishUser) {
		this.wishUser = wishUser;
	}

	public Category getWishCategory() {
		return wishCategory;
	}

	public void setWishCategory(Category wishCategory) {
		this.wishCategory = wishCategory;
	}
	
	
}
