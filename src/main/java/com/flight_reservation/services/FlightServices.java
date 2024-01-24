package com.flight_reservation.services;

import com.flight_reservation.payload.FlightDto;

import java.util.Date;
import java.util.List;

public interface FlightServices {
    List<FlightDto> findFlight(String from, String to, Date dateOfDeparture);
}
