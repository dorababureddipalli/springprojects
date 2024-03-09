package com.acoder.restcontrollers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acoder.pojo.UserEntity;
import com.acoder.repo.UserRepo;

@RestController
public class UserResource {

	@Autowired
	private UserRepo repo;
	
	
	@PostMapping(value = "/add", consumes = "application/json")
	public UserEntity add(@RequestBody UserEntity entity)
	{
		System.out.println(entity);
		repo.save(entity);
		return  repo.findById(entity.getId());
	}
	
	@PostMapping(value="/update", consumes = "application/json")
	public UserEntity update(@RequestBody UserEntity entity)
	{
		UserEntity id = repo.findById(entity.getId());
		if(entity.getId()!=null)
			id.setId(entity.getId());
		if(entity.getUserName()!=null)
			id.setUserName(entity.getUserName());
		if(entity.getSalary()!=null)
			id.setSalary(entity.getSalary());
		
		repo.update(id);
		return repo.findById(entity.getId());
	}
	
	@GetMapping(value="/delete/{id}")
	public Map<String, UserEntity> delete(
		@PathVariable("id") final String id
			)
	{
		repo.delete(id);
		return repo.findAll();
	}
	
	@GetMapping("/all")
	public Map<String,UserEntity> all()
	{
		return repo.findAll();
	}
	
}
