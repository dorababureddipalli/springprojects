package com.rootpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rootpack.pojos.PersonInfo;
import com.rootpack.responses.RestResponse;

@SpringBootApplication
public class RestClient01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestClient01Application.class, args);
		RestResponse restResponse = context.getBean(RestResponse.class);
		restResponse.invokeWebClient();
		
	}

}
