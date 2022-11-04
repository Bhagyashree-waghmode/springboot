package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class UserDetails {
	@Id
	@Column(length = 100)
	
	private String email;
	private String username;
	private String password;
	
	private String mobile;
	private String address;

	public UserDetails() {
		super();
	}

	public UserDetails(String username, String password, String email, String mobile, String address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
