package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.employees.repository","com.students.repository"} )
public class MultipleSorcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleSorcesApplication.class, args);
	}

}
