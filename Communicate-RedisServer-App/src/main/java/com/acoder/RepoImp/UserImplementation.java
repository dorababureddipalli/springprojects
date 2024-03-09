package com.acoder.RepoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.acoder.pojo.UserEntity;
import com.acoder.repo.UserRepo;

@Repository
public class UserImplementation implements UserRepo {
	
	
	//@Autowired
	private RedisTemplate<String,UserEntity>redisTemplate;
	//@Resource(name = "rt")
	@Autowired
	private HashOperations<String, String, UserEntity> hashOperations;
public UserImplementation(RedisTemplate<String, UserEntity> redisTemplate)
{
	this.redisTemplate=redisTemplate;
	this.hashOperations=this.redisTemplate.opsForHash();
}
	
	//@Override
	public void save(UserEntity user) {
		// TODO Auto-generated method stub
		hashOperations.put("USER", user.getId(), user);

	}

	//@Override
	public Map<String, UserEntity> findAll() {
		// TODO Auto-generated method stub
		
		return  hashOperations.entries("USER");
	}

	//@Override
	public UserEntity findById(String Id) {
		// TODO Auto-generated method stub
		
		return (UserEntity)hashOperations.get("USER", Id);
	}

	//@Override
	public void update(UserEntity entity) {
		// TODO Auto-generated method stub
             save(entity);
	}

	//@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

		hashOperations.delete("USER", id);
	}

}
