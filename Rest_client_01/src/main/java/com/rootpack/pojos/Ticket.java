package com.rootpack.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Ticket {
	private String passengerName;
	private Integer passengerAge;
	private String passengerGender;
	private String ticketID;
	private String ticketStatus;
	private Double ticketPrice;
	private String from;
	private String to;
	private String trainName;
	private Long trainNO;
	private LocalDate journeyDate;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	private String berthNo;

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Long getTrainNO() {
		return trainNO;
	}

	public void setTrainNO(Long trainNO) {
		this.trainNO = trainNO;
	}

	public LocalDate getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getBerthNo() {
		return berthNo;
	}

	public void setBerthNo(String berthNo) {
		this.berthNo = berthNo;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice
				+ ", from=" + from + ", to=" + to + ", trainName=" + trainName + ", trainNO=" + trainNO
				+ ", journeyDate=" + journeyDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", berthNo=" + berthNo + ", passengerName=" + passengerName + ", passengerAge=" + passengerAge
				+ ", passengerGender=" + passengerGender + "]";
	}

}
