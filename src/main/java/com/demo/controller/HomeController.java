package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.UserDetails;
import com.demo.repository.UserRepo;
import com.demo.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@RequestMapping(path = { "/", "index" })
	public String index() {
		System.out.println("i am controller");
		return "index";
	}

	@RequestMapping("/success")
	public String success() {
		System.out.println("i am controller");
		return "success";
	}

	@RequestMapping("/registration")
	public String home() {

		return "registration";
	}

	@PostMapping("/registration")
	public String registerUser(UserDetails user) {
		System.out.println(user);
		if (user.getUsername() != null && user.getEmail() != null && user.getMobile() != null
				&& user.getAddress() != null && user.getPassword() != null) {
			this.userService.insertUser(user);
			System.out.println("success redirecting");
			return "redirect:login?msg=registration done ";
		}
		return "redirect:index";
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("login");
		return "login";
	}

	@PostMapping("/login")
	public String validateUser(UserDetails loginUser, HttpSession session) {
		session.setAttribute("email", loginUser.getEmail());
		System.out.println(loginUser);
		if (userService.validateUser(loginUser))

			return "redirect:dashboard?msg=login successful";
		//session.setAttribute("errormsg", "INVALID CREDENTIALS");
		return "redirect:login?msg=INVALID CREDENTIALS";
	}

	@PostMapping("/update")
	public String update(UserDetails loginUser,HttpSession session) {
		String email=(String)session.getAttribute("email");
	String username=loginUser.getUsername();
	String password=loginUser.getPassword();
	if(this.userService.update(email, username, password))
		return "redirect:update?msg=successfull";
	return "redirect:update?msg=something went wrong";
	
	}
	@GetMapping("/update")
	public String update1() {
		return "update";
	}
	
	@GetMapping("/dashboard")
	public String dash() {
		return "dashboard";
	}
	
}
