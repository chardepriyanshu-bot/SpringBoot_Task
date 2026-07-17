package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
