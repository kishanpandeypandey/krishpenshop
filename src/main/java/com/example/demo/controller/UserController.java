package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entitys.Users;
import com.example.demo.helper.BCrypt;
import com.example.demo.service.UserServices;

@Controller
public class UserController {
	
	@Autowired
	UserServices userServices;

	@RequestMapping("/")
	public String home() {
		
		return"home";
	}
	
	@RequestMapping("/seeAiiUser")
	public String index(Model model) {
	List<Users> list=	userServices.findAllUser();
	
	model.addAttribute("userList", list);
		return "seeAiiUserList";
	}
	
	@RequestMapping("/addNewUser")
	public String addNewUser() {
		return "addNewUser";
		
	}
	
	@RequestMapping("/Login")
	public String singin() {
		
		return "singin";
	}
	
	@RequestMapping("/saveNewUser")
	public String saveNewUser(@RequestParam("userName")String name,
			@RequestParam("userNumber")Long Number,
			@RequestParam("userEmail")String email,
			@RequestParam("userpassword")String password
			, Model model) {
		String EncryptedPassword = BCrypt.hashpw(password,BCrypt.gensalt(12));
		Users user = new Users();
		
		user.setUserName(name);
		user.setUserNumber(Number);
		user.setUseremail(email);
		user.setPassword(EncryptedPassword);
		
		userServices.saveNewUser(user);
		model.addAttribute("msg","successfully register");
		return"singin";
		
	}
	
	@RequestMapping("/singInDetails")
	public String singInDetail(@RequestParam("emailNumber") String emailornumber , Model model) {
		
		 List<Users> list = userServices.getUserByEmail(emailornumber);
		 model.addAttribute("list", list);
		return "singin";
		
	}
	
}

