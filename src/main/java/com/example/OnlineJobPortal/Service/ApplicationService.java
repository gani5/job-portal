package com.example.OnlineJobPortal.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineJobPortal.Dao.ApplicationRepository;
import com.example.OnlineJobPortal.Model.Application;
import com.example.OnlineJobPortal.Model.Job;
import com.example.OnlineJobPortal.Model.User;
@Service
public class ApplicationService {
	
	@Autowired
	ApplicationRepository repository;

	public List<Application> getApplication() {
		
		return repository.findAll();
	}

	public void applyForJob(User user,Job job,String status) {
		
		
		Application app=new Application();
		app.setUser(user);
		app.setJob(job);
		app.setStatus(status);
		repository.save(app);
		
	}

}
