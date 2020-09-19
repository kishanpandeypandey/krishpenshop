package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entitys.Users;
import com.example.demo.helper.BCrypt;
import com.example.demo.service.UserServices;

import net.bytebuddy.asm.Advice.Return;

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
	
	@PostMapping("/singInDetails")
	public String singInDetail(@RequestParam("emailNumber") String emailornumber , Model model,HttpSession session) {
		
		 List<Users> list = userServices.getUserByEmail(emailornumber);
		 session.setAttribute("list", list);
		return "singin";
		
	}
	@PostMapping("/singInPassword")
	public String singisPassword(@RequestParam("password") String password,HttpSession session,Model model){
     List<Users> list3 = (List)session.getAttribute("list");
     String encryptedPassword = null;
    for(Users user3 : list3) {
    	 encryptedPassword=  user3.getPassword();
    }
      boolean checkuser = BCrypt.checkpw(password , encryptedPassword );
      if(checkuser)  {
	return "home";
      }
      else {
    	  session.removeAttribute("list");
      model.addAttribute("msg", "incorrect password");
    	  return "singin";
      }
	}
	
	@GetMapping("/Logout")
	public String userLogout(HttpSession session) {
		session.removeAttribute("list");
		return "home";
	}
	
	
}

