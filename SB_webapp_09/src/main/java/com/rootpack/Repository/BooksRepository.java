package com.rootpack.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rootpack.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Serializable> {

}
