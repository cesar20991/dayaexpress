package com.dayaexpress.model;

import java.sql.Timestamp;

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
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "article", nullable = false)
	private String article;
	
	@Column(name = "views", nullable = true)
	private Integer views;
	
	@Column(name = "shared", nullable = true)
	private Integer shared;
	
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
		
	@ManyToOne
	@JoinColumn(name = "iduser")
	private User blogUser;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category blogCategory;

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

	public User getBlogUser() {
		return blogUser;
	}

	public void setBlogUser(User blogUser) {
		this.blogUser = blogUser;
	}

	public Category getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(Category blogCategory) {
		this.blogCategory = blogCategory;
	}
	
	
	
}
