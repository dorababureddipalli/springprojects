package com.rootpack.bindings;

import org.springframework.hateoas.RepresentationModel;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books extends RepresentationModel<Books> {
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private Double bookPrice;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(Integer bookId, String bookName, String bookAuthor, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

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

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
