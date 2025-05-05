package com.example.OnlineJobPortal.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineJobPortal.Model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
