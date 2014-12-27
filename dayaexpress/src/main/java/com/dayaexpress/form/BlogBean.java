package com.dayaexpress.form;

import java.sql.Timestamp;

public class BlogBean {
	
	private Integer idBlog;	
	private String title;	
	private String article;	
	private Integer views;	
	private Integer shared;	
	private Timestamp creationDate;	
	private String state;	
	private String tag;	
	private String year;	
	private String period;
	
	//user
	
	//category
	
	public Integer getIdBlog() {
		return idBlog;
	}
	public void setIdBlog(Integer idBlog) {
		this.idBlog = idBlog;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getShared() {
		return shared;
	}
	public void setShared(Integer shared) {
		this.shared = shared;
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
