package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	//this method make for registration using @requestParam
	
//	@RequestMapping("/saveNewUser")
//	public String saveNewUser(@RequestParam("userName")String name,
//			@RequestParam("userNumber")Long Number,
//			@RequestParam("userEmail")String email,
//			@RequestParam("userpassword")String password
//			,Model model) {
//	if(result.hasErrors()) {
//			
//			return "addNewUser";
//		}
//		
//		String EncryptedPassword = BCrypt.hashpw(password,BCrypt.gensalt(12));
//		Users user = new Users();
//		
//		user.setUserName(name);
//      if(result.hasErrors()) {
//			
//			return "addNewUser";
//		}
//		user.setUserNumber(Number);
//		user.setUseremail(email);
//		user.setPassword(EncryptedPassword);
//		user.setUserCategory("normalUser");
//		
//
//	
//		
//		userServices.saveNewUser(user);
//
//		model.addAttribute("msg","successfully register");
//		return"singin";
//		}
	
	@PostMapping("/saveNewUser")
	public String saveNewUser(@ModelAttribute("user") Users user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			
			return"addNewUser";
		}
		System.out.println(user.getUseremail());
		
		String password = user.getPassword();
		String EncryptedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
		user.setPassword(EncryptedPassword);
		user.setUserCategory("normalUser");
		userServices.saveNewUser(user);
		model.addAttribute("msg","successfully register");
		return "singin";
	}
	
	@PostMapping("/singInDetails")
	public String singInDetail(@RequestParam("emailNumber") String emailornumber , Model model,HttpSession session) {
		 Users user2= userServices.getUserByEmail(emailornumber);
		 session.setAttribute("list", user2);
		return "singin";
		
	}
	
	@GetMapping("/singInDetails")
		public String singInDetailHitAgain(HttpSession session) {
		 Users user=  (Users)session.getAttribute("list");
		 if(user == null) {
			 return "homw";
			 
		 }
		 
		return "singin";
	}
	
	
	@PostMapping("/singInPassword")
	public String singisPassword(@RequestParam("password") String password,HttpSession session,Model model){
     Users user3 = (Users)session.getAttribute("list");
     String encryptedPassword = null;
    	 encryptedPassword=  user3.getPassword();
    
      boolean checkuser = BCrypt.checkpw(password , encryptedPassword );
      if(checkuser)  {
    	  
    	   String category= user3.getUserCategory();
    	   if(category.equals("admin"))
    	   {
    		return "admin" ;  
    		   
    	   }
    	  return "home";
      }
      else {
    	  session.removeAttribute("list");
      model.addAttribute("msg", "incorrect password");
    	  return "singin";
      }
	}
	
	@GetMapping("/singInPassword")
	public String singisPasswordHitagain(HttpSession session) {
		Users user=  (Users)session.getAttribute("list");
		if(user == null) {
		return "home";
		}else {
		String category=  user.getUserCategory();
		if(category.equals("admin")) {
			return "admin";
		}
		return "home";
	}
	}
	@GetMapping("/Logout")
	public String userLogout(HttpSession session) {
		session.removeAttribute("list");
		return "home";
	}
	
	
}

