package com.rootpack.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rootpack.bindings.Books;

@RestController
public class BookRestController {
	@GetMapping(value="/getBook" ,
		produces= {
		"application/json",
		"application/xml"	
		},
		consumes= {
		"application/json",
		"application/xml"	
		}
	)
	public ResponseEntity<Books> getBook(@RequestParam("bookId") Integer bookId) {
		Books b=null;
		if(bookId==101)
		 b = new Books(101, "springBoot", "rodjohnson", 200.00);
		
		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks())
				.withRel("All-Books");
		b.add(withRel);
		return new ResponseEntity<Books>(b, HttpStatus.CREATED);
	}
	@GetMapping(value="/allbooks",
			produces= {
				"application/json",
			    "application/xml"
					},
			consumes= {
				"application/json",
				"application/xml"	
					}
			)
	public List<Books> getAllBooks() {
		List<Books> bList = new ArrayList<>();
		Books b1 = new Books(102, "spring", "rodjohnson", 300.00);
		Books b2 = new Books(103, "springMVC", "rodjohnson", 250.00);
		Books b3 = new Books(104, "springCloud", "rodjohnson", 400.00);
		Books b4 = new Books(105, "springBoot with REST", "rodjohnson", 600.00);
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);

		return bList;
	}
}
