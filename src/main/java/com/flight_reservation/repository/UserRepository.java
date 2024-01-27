package com.flight_reservation.repository;

import com.flight_reservation.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE (u.email = :email OR u.username = :username) AND u.password = :password")
    Boolean findByEmailOrUsernameAndPassword(@Param("email") String email, @Param("username") String username,
            @Param("password") String password);

}
