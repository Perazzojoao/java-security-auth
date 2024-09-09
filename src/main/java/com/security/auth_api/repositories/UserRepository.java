package com.security.auth_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.auth_api.domain.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
