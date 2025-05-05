package com.example.OnlineJobPortal.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineJobPortal.Model.Application;
import com.example.OnlineJobPortal.Model.Job;
import com.example.OnlineJobPortal.Model.User;



public interface ApplicationRepository extends JpaRepository<Application, Integer> {



}
