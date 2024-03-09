package com.acoder.service;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.acoder.kafkaconstant.KafkaConstant;
import com.acoder.pojo.Customer;

@Service
public class ConsumerService {

	@KafkaListener(topics = KafkaConstant.TOPIC , groupId = "07-Customer-group")
	public void listener( List <Customer>  customer)
	{
		System.out.println("Customer::"+customer);
		
	}
	
}
