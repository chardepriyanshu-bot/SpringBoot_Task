package com.pc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pc.entity.Book;
import com.pc.service.IBookService;

@Controller
public class BookController {
	private final IBookService service;
	
	public BookController(IBookService service) {
		this.service=service;
	}
	
	@GetMapping("/")
	public String registerBook() {
		return "book-form";
	}
	
	@PostMapping("/register")
	public String showBooks(@ModelAttribute Book book, Model model) {
		service.addBook(book);
		List<Book> list=service.getBooks();
		model.addAttribute("bookList",list);
		return "book-list";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam Long id, Model model) {
	    Book book = service.getById(id);  // fetch existing record
	    model.addAttribute("book", book);
	    return "book-update"; // form pre-filled with this book's data
	}

	@PostMapping("/update")
	public String updateBook(@ModelAttribute Book book, Model model) {
	    service.updateBook(book);
	    model.addAttribute("bookList", service.getBooks());
	    return "book-list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam Long id, Model model) {
	    service.deleteBook(id);
	    model.addAttribute("bookList", service.getBooks());
	    return "book-list";
	}
}
