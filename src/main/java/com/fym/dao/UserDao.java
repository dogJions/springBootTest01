package com.fym.dao;

import java.util.List;

import com.fym.entity.User;

public interface UserDao {
	
	public List<User> selectAll();
}
