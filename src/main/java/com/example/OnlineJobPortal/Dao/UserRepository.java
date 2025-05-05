package com.example.OnlineJobPortal.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineJobPortal.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
