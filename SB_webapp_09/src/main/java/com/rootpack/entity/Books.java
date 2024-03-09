package com.rootpack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK_DTLS")
public class Books {
	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Integer bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	@Column(name = "BOOK_PRICE")
	private double bookPrice;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
