package com.example.ECommerce.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ECommerce.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username); // Find by username

    Optional<User> findByEmail(String email); // Find by email

    boolean existsByUsername(String username); // Check if username exists

    boolean existsByEmail(String email); // Check if email exists

}
