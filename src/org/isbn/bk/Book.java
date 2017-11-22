package org.isbn.bk;

import java.util.Date;

public class Book {
	private int id;
	private String name;
	private String publisher;
	private String author;
	private double prize;
	private Date published;
	private String isbn_no;
	public Book(int id, String name, String publisher, String author, double prize, Date published, String isbn_no) {
		super();
		this.id = id;
		this.name = name;
		publisher = publisher;
		author = author;
		this.prize = prize;
		this.published = published;
		this.isbn_no = isbn_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		author = author;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	public String getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(String isbn_no) {
		this.isbn_no = isbn_no;
	}
	
}
