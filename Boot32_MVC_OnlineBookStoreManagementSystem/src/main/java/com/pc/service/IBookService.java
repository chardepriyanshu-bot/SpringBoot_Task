package com.pc.service;

import java.util.List;

import com.pc.entity.Book;

public interface IBookService {
	public Book addBook(Book book);
	public List<Book> getBooks();
	public Book updateBook(Book book);
	public String deleteBook(Long id);
	public Book getById(Long bookId) {
}
