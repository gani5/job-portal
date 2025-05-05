package com.example.OnlineJobPortal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineJobPortal.Dao.UserRepository;
import com.example.OnlineJobPortal.Model.User;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	public void addUser(User user) {

		repository.save(user);

	}

	public List<User> getAllUserByEmail(String email) {
		
		return repository.findAll();
	}

}
