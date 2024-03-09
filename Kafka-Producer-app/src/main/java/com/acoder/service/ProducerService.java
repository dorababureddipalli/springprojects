package com.acoder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.acoder.kafkaconstants.KafkaConstants;
import com.acoder.pojo.Customer;

@Service
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	

	public void sendMassage(List<Customer> customer)
	{
		System.out.println("successfully added to topic");
		for (Customer customer2 : customer) {
			
			kafkaTemplate.send(KafkaConstants.TOPI, customer2);
		}
	}
}
