package com.ank.inventoryServicesdataapi.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loginUser", unique = true, nullable = false)	
	private String loginUser;
	private String password;
	
	private User userDetails;
	
	

}
