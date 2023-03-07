package cau1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Book implements interfaceBook, Serializable {
	private int id;
	private String name;
	private String author;
	private String importDay;

	public Book(int id, String name, String author, String importDay) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.importDay = importDay;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", importDay=" + importDay + "]";
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImportDay() {
		return importDay;
	}

	public void setImportDay(String importDay) {
		this.importDay = importDay;
	}


	@Override
	public void inputBook( ) {
		
	}
	
}
