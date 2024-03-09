package com.rootpack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rootpack.Repository.BooksRepository;
import com.rootpack.entity.Books;

@Controller
public class BooksController {

	@Autowired
	private BooksRepository bookRepo;

	@GetMapping(value = { "/", "/form" })
	public String loadForm(Model model) {
		model.addAttribute("books", new Books());
		return "loadForm";
	}

	@PostMapping("/save")
	public String handleForm(@ModelAttribute("books")Books books, Model model) {

		Books savedEntity = bookRepo.save(books);

		if (savedEntity != null && savedEntity.getBookId() != null)
			model.addAttribute("successMsg", "Book saved successfully");
		else
			model.addAttribute("failMsg", "Book Saving Failed");

		return "loadForm";
	}

	@GetMapping("/view")
	public String viewBooks(Model model) {
		List<Books> bookList = bookRepo.findAll();
		model.addAttribute("k",bookList);
		return "DisplayBooks";
	}

}
