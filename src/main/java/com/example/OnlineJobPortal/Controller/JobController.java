package com.example.OnlineJobPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineJobPortal.Model.Job;
import com.example.OnlineJobPortal.Model.User;
import com.example.OnlineJobPortal.Service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	JobService service;
	
	@PostMapping("/{post}")
	public String postJob(@RequestBody Job job) {
		service.postJob(job);
		return "Job Posted Successfully!!";
	}
	
	@GetMapping("/{list}")
	public List<Job> listJob()
	{
		return service.listJob();
	}

}
