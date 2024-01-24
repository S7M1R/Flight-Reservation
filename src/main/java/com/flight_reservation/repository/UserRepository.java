package com.flight_reservation.repository;

import com.flight_reservation.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean findByEmailOrUsernameAndPassword(String email, String username, String password);

}
