package com.security.auth_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.auth_api.domain.user.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, UUID> {
  Optional<User> findByEmail(String email);

}
