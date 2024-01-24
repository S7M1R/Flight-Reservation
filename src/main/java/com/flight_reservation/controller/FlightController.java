package com.flight_reservation.controller;

import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.services.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    private FlightServices flightServices;

    @RequestMapping("/findFlight")
    public String findFlight(@RequestParam("from") String From, @RequestParam("to") String To, @RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-DD-YYYY") Date DateOfDeparture , Model model){
        List<FlightDto> flights = flightServices.findFlight(From, To, DateOfDeparture);
        model.addAttribute("flights", flights);
        return "private/FlightsView";
    }
}
