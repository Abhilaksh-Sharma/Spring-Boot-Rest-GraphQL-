package practice.springboot.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	//Fields
	@Id
	private long id;
	private String title;
	private String isbn;
	private int pageCount;
	
	//Parameterized Constructor
	public Book(long id, String title, String isbn, int pageCount) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.pageCount = pageCount;
	}
	
	
	//Getters & Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	


}
