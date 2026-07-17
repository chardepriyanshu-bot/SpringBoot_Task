package com.pc.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pc.entity.Book;
import com.pc.repository.IBookRepository;
import com.pc.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {
	
	private final IBookRepository repository;
	
	public BookServiceImpl(IBookRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public Book addBook(Book book) {
		Book b=repository.save(book);
		return b;
	}

	@Override
	public List<Book> getBooks() {
		
		return repository.findAll();
	}
	@SuppressWarnings("deprecation")
	@Override
	public Book getById(Long bookId) {
		return repository.getById(bookId);
	}

	@Override
	public Book updateBook(Book book) {
		Book b=repository.findById(book.getBookId()).orElseThrow(()->new IllegalArgumentException("Book not found"));
		//Book uBook=repository.save(b);
		
			b.setTitle(book.getTitle());
		    b.setAuthor(book.getAuthor());
		    b.setPrice(book.getPrice());

		    return repository.save(b);
	}

	@Override
	public String deleteBook(Long id) {
		Book b=repository.findById(id).orElseThrow(()->new IllegalArgumentException("Book not found"));
		repository.deleteById(b.getBookId());
		return "Book is deleted.";
	}
	
	

}
