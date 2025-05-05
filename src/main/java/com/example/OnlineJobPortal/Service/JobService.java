package com.example.OnlineJobPortal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineJobPortal.Dao.JobRepository;
import com.example.OnlineJobPortal.Model.Job;

@Service
public class JobService {

	@Autowired
	JobRepository repositoy;
	
	public List<Job> listJob() {
		
		return repositoy.findAll();
	}

	public void postJob(Job job) {
		repositoy.save(job);
		
	}

}
