package com.sunsoft.service;

import java.util.List;

import com.sunsoft.entities.Book;

public interface AuthorBookService {

	public List<Book> getAllBooks();
	
	public List<Book> getBooksByAuthor(String author_name);
	
	public List<Book> getBooksByPriceRange(double min,double max);
	
	public List<String> getAuthorName(long b_id);
	
}

