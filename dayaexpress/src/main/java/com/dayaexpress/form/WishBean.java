package com.dayaexpress.form;

import java.sql.Timestamp;

public class WishBean {
	
	private Integer idWish;
	private String title;
	private String descriptionWish;
	private Timestamp creationDate;
	private String state;
	private String tag;
	private String year;
	private String period;
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
	
	

}
