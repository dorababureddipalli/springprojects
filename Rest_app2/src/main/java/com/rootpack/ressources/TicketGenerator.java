package com.rootpack.ressources;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rootpack.requests.PersonInfo;
import com.rootpack.responses.Ticket;

@RestController
public class TicketGenerator {
	@PostMapping(value = "/bookticket", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Ticket> bookingTicket(@RequestBody PersonInfo pInfo) {
		Ticket t = new Ticket();
		t.setTrainNO(17210l);
		t.setTrainName("seshadri Express");
		t.setFrom("kakinada port");
		t.setTo("Tirupathi");

		LocalDate journeyDate = LocalDate.of(2023, Month.AUGUST, 5);
		LocalDateTime arrivalTime = journeyDate.atTime(LocalTime.of(19, 50));
		LocalDateTime departureTime = journeyDate.atTime(LocalTime.of(20, 00));
		// System.out.println(dateTime);

		t.setArrivalTime(arrivalTime);
		t.setDepartureTime(departureTime);
		t.setTicketID("tcnsh17210");
		t.setTicketPrice(590.00);
		t.setTicketStatus("confirmed");
		t.setBerthNo("s9-56");
		t.setJourneyDate(journeyDate);
		t.setPassengerName(pInfo.getName());
		t.setPassengerAge(pInfo.getAge());
		t.setPassengerGender(pInfo.getGender());

		return new ResponseEntity<Ticket>(t, HttpStatus.CREATED);
	}
}
