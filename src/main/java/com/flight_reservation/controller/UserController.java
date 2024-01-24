package com.flight_reservation.controller;

import com.flight_reservation.payload.UserDto;
import com.flight_reservation.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String LoginPage() {
        return "/public/Login";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "public/Signup";
    }

    @Autowired
    private UserServices userServices;


    @RequestMapping("/SignupData")
    public String SaveSignupData(@ModelAttribute("UserDto") UserDto userDto , Model model) {
        boolean SignupStatus = userServices.SaveSignupData(userDto);
        if (!SignupStatus) {
            model.addAttribute("msg", "Signup Failed please try again");
            return "public/Signup";
        }
        model.addAttribute("msg", "Account Created Successfully Login!");
        return "public/Login";
    }

    @RequestMapping("/verifyLogin")
    public String verifyLogin(@RequestParam("email") String Email, @RequestParam("username") String Username,  @RequestParam("password") String Password, Model model) {
        boolean verificationStatus = userServices.verifyUserLogin(Email, Username, Password);
        if (!verificationStatus){
            model.addAttribute("msg", "Invalid User Credentials Try again!");
            return "public/Login";
        }
        return "private/Home";
    }




}
