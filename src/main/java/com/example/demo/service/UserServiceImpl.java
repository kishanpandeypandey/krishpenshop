package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entitys.Users;

@Service
public class UserServiceImpl implements UserServices {
	
	public List<Users> list;

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void saveNewUser(Users user) {
userRepository.save(user);
	
	}

	@Override
	
	public List<Users> findAllUser() {
		System.out.println("before repo");
		try {
      list= userRepository.findAll();
    System.out.println("after print");
   
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return list;	
	}

	@Override
	public List<Users> getUserByEmail(String email) {
		 List<Users> list = userRepository.getUserByEmail(email);
		return list;
	}
	
	

}
