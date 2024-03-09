package com.acoder.repo;

import java.util.Map;

import com.acoder.pojo.UserEntity;

public interface UserRepo {
	
void save(UserEntity user);

Map<String,UserEntity> findAll();

UserEntity findById(String Id);

void update(UserEntity entity);

void delete(String id);



}
