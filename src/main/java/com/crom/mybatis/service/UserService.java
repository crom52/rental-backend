package com.crom.mybatis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crom.mybatis.dao.UserDao;
import com.crom.mybatis.entity.UserDTO;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public UserDTO get(Integer id){
		return userDao.get(id);
	}

}

