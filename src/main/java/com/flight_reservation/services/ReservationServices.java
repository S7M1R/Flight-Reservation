package com.flight_reservation.services;

import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.payload.PassengerDto;
import com.flight_reservation.payload.ReservationDto;

public interface ReservationServices {
    FlightDto ViewReservations(long flightId);

    ReservationDto ConfirmReservation(PassengerDto passengerDto);
}
