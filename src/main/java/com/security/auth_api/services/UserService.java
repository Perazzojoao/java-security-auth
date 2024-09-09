package com.security.auth_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.auth_api.repositories.UserRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;
}
