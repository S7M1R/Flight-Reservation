package com.flight_reservation.services;

import com.flight_reservation.payload.UserDto;

import jakarta.validation.Valid;

public interface UserServices {
    boolean SaveSignupData(UserDto userDto);

    boolean verifyUserLogin(@Valid String username, @Valid String email, @Valid String password);
}
