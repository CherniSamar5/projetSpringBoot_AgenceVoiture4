package com.samar.voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samar.voitures.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
