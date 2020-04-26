package com.sunsoft.service;

import com.sunsoft.bean.Author;
import com.sunsoft.dao.AuthorDAOImpl;


public class AuthorServiceImpl implements AuthorService{

	AuthorDAOImpl dao = new AuthorDAOImpl();

	
		
	@Override
	public boolean addAuthor(Author author) {
		return dao.addAuthor(author);
	}

	
	@Override
	public Author updateAuthor(Author author) {
		return dao.updateAuthor(author);
	}


	
	@Override
	public boolean deleteAuthor(Integer id) {
		return dao.deleteAuthor(dao.findAuthor(id));
	}

	public Author findAuthor(Integer id) {
		return dao.findAuthor(id); 
	}

}
