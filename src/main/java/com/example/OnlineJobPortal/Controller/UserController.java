package com.example.OnlineJobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineJobPortal.Model.User;
import com.example.OnlineJobPortal.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController{

	@Autowired
	UserService service;

	@PostMapping
	public String addUser(@RequestBody User user) {
		service.addUser(user);
		return "User Added Successfully!!";
	}
	
	@GetMapping("/{email}")
	public List<User> getAllUserByEmail(@PathVariable String email)
	{
		return service.getAllUserByEmail(email);
	}
	

}
