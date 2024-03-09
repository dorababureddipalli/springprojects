package com.acoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CommunicateRedisServerDbAnnotationsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicateRedisServerDbAnnotationsAppApplication.class, args);
	}

}
