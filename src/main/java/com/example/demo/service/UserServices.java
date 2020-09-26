package com.example.demo.service;


import java.util.List;

import com.example.demo.entitys.Users;

public interface UserServices {
	
	void saveNewUser(Users user);
	List<Users> findAllUser();
	Users getUserByEmail(String email);

}
