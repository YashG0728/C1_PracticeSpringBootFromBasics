package com.example.c1_bootjpaexample.repository;

import com.example.c1_bootjpaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
