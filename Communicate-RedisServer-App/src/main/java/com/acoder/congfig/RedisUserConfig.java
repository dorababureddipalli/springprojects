package com.acoder.congfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.acoder.pojo.UserEntity;

@Configuration
public class RedisUserConfig {
	
	//this method is used create jedisConnectionFactory
	@Bean
	 RedisConnectionFactory jf()
	{
		//LettuceConnectionFactory factory = new LettuceConnectionFactory();
		
		//When Redis server in another system then we should give the host name
		//password and server port number
//		factory.setHostName(hostName);
//		factory.setPassword("");
//		factory.setPort(9372);
		return new LettuceConnectionFactory();
	}

    @Bean
	RedisTemplate<String , UserEntity> rt()
	{
		RedisTemplate<String, UserEntity> redisTemplate= new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jf());
		return redisTemplate;
	}
	
}
