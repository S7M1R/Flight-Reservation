package com.flight_reservation.controller;

import com.flight_reservation.entity.Reservation;
import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.payload.PassengerDto;
import com.flight_reservation.payload.ReservationDto;
import com.flight_reservation.payload.ReservationUpdateRequestDto;
import com.flight_reservation.services.ReservationServices;
import com.flight_reservation.util.EmailUtil;
import com.flight_reservation.util.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

    @Autowired
    private EmailUtil emailUtil;

    @RequestMapping("/viewReservations")
    public String ViewReservations(@RequestParam("flightId") long FlightId, Model model){
        FlightDto flightDto = reservationServices.ViewReservations(FlightId);
        model.addAttribute("flights" , flightDto);
        return "private/ViewReservations";
    }

    @RequestMapping("/confirmReservation")
    public String confirmReservation(PassengerDto passengerDto,Model model) {
         String filePath="D:\\4.8.1 version\\flight_reservation_app_5\\ticket\\booking";
        ReservationDto reservation = reservationServices.ConfirmReservation(passengerDto);
        PdfGenerator pdf = new PdfGenerator();
        pdf.generatePdf(filePath+reservation.getId()+".pdf",
                reservation.getPassenger().getFirstName(),
                reservation.getPassenger().getEmail(),
                reservation.getPassenger().getMobile(),
                reservation.getFlight().getAirLine(),
                reservation.getFlight().getDateOfDeparture(),
                reservation.getFlight().getDepartureCity(),
                reservation.getFlight().getArrivalCity());
        model.addAttribute("reservationId", reservation.getId());
        EmailUtil eUtil = new EmailUtil();
        String Attachment = filePath+reservation.getId()+".pdf";
        emailUtil.sendItinerary(passengerDto.getEmail(),Attachment);
        return"confirmReservation";
    }

    @RequestMapping("/checkin/.com")
    public String show(){
        return "private/startCheckedIn";
    }

    @RequestMapping("/procedCheckedIn")
    public String find(@RequestParam("id") Long id, Model model){
        Reservation reservation = reservationServices.findReservtaion(id);
        model.addAttribute("r", reservation);
        return "displayreservation";
    }

    @RequestMapping("/proced")
    public String procedCheckin(@RequestParam ("id")Long id,@RequestParam("numberOfBags") int numberOfBags) {
        ReservationUpdateRequestDto request= new ReservationUpdateRequestDto();
        request.setId(id);
        request.setNumberOfBags(numberOfBags);
        request.setCheckedIn(true);
        reservationServices.updateReservation(request);
        return "confirmReservation2";
    }

}
