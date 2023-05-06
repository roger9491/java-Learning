package com.example.java.mapper;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
