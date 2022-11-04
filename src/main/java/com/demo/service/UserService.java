package com.demo.service;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//business logic
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.UserDetails;
import com.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public boolean insertUser(UserDetails user) {
		this.userRepo.save(user);
		return true;
	}

	public boolean validateUser( UserDetails l) {
		System.out.println(l);
		if(this.userRepo.existsById(l.getEmail())) {
			Optional<UserDetails> login= this.userRepo.findById(l.getEmail());
			
			String password= login.get().getPassword();
			if(password.equals(l.getPassword()))
				return true;
			return false;
		}
		return false;
	}
	
	// update data
		public boolean update(String email,String userName,String password) {
			
			if(this.userRepo.existsById(email))
			{
				
			UserDetails user=	this.userRepo.findById(email).get();
			
			user.setUsername(userName);
			user.setPassword(password);
			this.userRepo.save(user);
			return true;
			}
			return false;
		
		}
	
}


