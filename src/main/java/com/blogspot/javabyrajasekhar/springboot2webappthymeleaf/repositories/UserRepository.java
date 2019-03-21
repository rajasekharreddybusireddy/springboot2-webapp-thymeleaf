package com.blogspot.javabyrajasekhar.springboot2webappthymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogspot.javabyrajasekhar.springboot2webappthymeleaf.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
