package com.flight_reservation.services.ServicesIMPL;

import com.flight_reservation.entity.User;
import com.flight_reservation.payload.UserDto;
import com.flight_reservation.repository.UserRepository;
import com.flight_reservation.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesIMPL implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean SaveSignupData(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsename());
        user.setPassword(userDto.getPassword());
        User savedData = userRepository.save(user);
        if (savedData==null) return false;
        return true;
    }

    @Override
    public boolean verifyUserLogin(String email, String username, String password) {
        Boolean byEmailOrUsernameAndPassword = userRepository.findByEmailOrUsernameAndPassword(email, username,
                password);
        if (!byEmailOrUsernameAndPassword) {
            return false;
        }
        return true;
    }


}
