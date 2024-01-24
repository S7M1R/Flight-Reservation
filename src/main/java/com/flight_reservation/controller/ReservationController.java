package com.flight_reservation.controller;

import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.payload.PassengerDto;
import com.flight_reservation.payload.ReservationDto;
import com.flight_reservation.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

    @RequestMapping("/viewReservations")
    public String ViewReservations(@RequestParam("flightId") long FlightId, Model model){
        FlightDto flightDto = reservationServices.ViewReservations(FlightId);
        model.addAttribute("flights" , flightDto);
        return "private/ViewReservations";
    }

    @RequestMapping("/BookTicket")
    public String ConfirmReservation(@RequestBody PassengerDto passengerDto, Model model){
        ReservationDto reservationDto = reservationServices.ConfirmReservation(passengerDto);
        model.addAttribute("reservation", reservationDto.getId());
        return "private/ConfirmReservation";
    }
    
}
