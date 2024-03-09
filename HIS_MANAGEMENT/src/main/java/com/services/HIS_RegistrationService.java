package com.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class HIS_RegistrationService {
	public String generateRegistrationNumber() {
		// Prefix for the registration number
		String prefix = "reg";

		// Generate a random 6-digit number
		Random random = new Random();
		int randomDigits = 100000 + random.nextInt(900000); // Generates a random number between 100000 and 999999

		// Concatenate the prefix and the random digits
		String registrationNumber = prefix + randomDigits;

		return registrationNumber;
	}

	public HttpResponse<String> sendGetRequest(String apiUrl) {
		HttpResponse<String> response = null;
		try {
			// Create an HttpClient
			HttpClient httpClient = HttpClient.newHttpClient();

			// Define the GET request
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).GET().build();

			// Send the request and receive the response
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			// Print the response status code and body
//            System.out.println("GET Request Status Code: " + response.statusCode());
//            System.out.println("GET Request Response Body: " + response.body());
			return response;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
