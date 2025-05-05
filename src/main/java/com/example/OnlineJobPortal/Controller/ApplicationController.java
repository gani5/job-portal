package com.example.OnlineJobPortal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineJobPortal.Model.Application;
import com.example.OnlineJobPortal.Model.User;
import com.example.OnlineJobPortal.Service.ApplicationService;
@RestController
@RequestMapping("/application")
public class ApplicationController {
@Autowired
	ApplicationService service;
	
@PostMapping("/{post}")
public String applyForJob(@RequestBody Application application)
{
	service.applyForJob(application.getUser(),application.getJob(),application.getStatus());
	return"Applied Successfully..";
}
@GetMapping("/{list}")
public List<Application> getApplications() {
    return service.getApplication();
}
	
}
