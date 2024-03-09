package com.rootpack.responses;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.rootpack.pojos.PersonInfo;
import com.rootpack.pojos.Ticket;

@Component
public class RestResponse {
	
	public void invokeWebClient() {
		PersonInfo pinfo= new PersonInfo();
		pinfo.setName("dorababu");
		pinfo.setAge(23);
		pinfo.setGender("M");
		WebClient create = WebClient.create();
		String s = create.post()
				.uri("http://localhost:8089/bookticket")
				.body(BodyInserters.fromValue(pinfo))
				.header("Content-Type", "application/json")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		 System.out.println(s);

	}

}
