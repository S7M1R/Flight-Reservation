package com.flight_reservation.services;

import com.flight_reservation.entity.Reservation;
import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.payload.PassengerDto;
import com.flight_reservation.payload.ReservationDto;
import com.flight_reservation.payload.ReservationUpdateRequestDto;

public interface ReservationServices {
    FlightDto ViewReservations(long flightId);

    ReservationDto ConfirmReservation(PassengerDto passengerDto);

     Reservation findReservtaion(long id);

    public Reservation updateReservation(ReservationUpdateRequestDto request);
}
