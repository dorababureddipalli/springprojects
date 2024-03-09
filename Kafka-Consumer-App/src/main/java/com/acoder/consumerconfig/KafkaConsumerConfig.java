package com.acoder.consumerconfig;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.acoder.kafkaconstant.KafkaConstant;
import com.acoder.pojo.Customer;

@Configuration
public class KafkaConsumerConfig {

	/**
	 * @return  DefaultKafkaConsumerFactory  with StringDeserializer and JsonDeserializer
	 */
	@Bean
ConsumerFactory<String, Customer> factory()
{
	Map<String, Object> consumerConfig= new HashMap<>();
	
consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,KafkaConstant.HOST);
consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
consumerConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	return new DefaultKafkaConsumerFactory<>(consumerConfig, new StringDeserializer(), new JsonDeserializer<>(Customer.class));
}
	
	
	@Bean
	ConcurrentKafkaListenerContainerFactory<String , Customer> factoryConcurrentKafkaListenerContainerFactory()
	{
		ConcurrentKafkaListenerContainerFactory<String,Customer> containerFactory = new ConcurrentKafkaListenerContainerFactory<>();
		containerFactory.setConsumerFactory(factory());
		return containerFactory;
	}
}
