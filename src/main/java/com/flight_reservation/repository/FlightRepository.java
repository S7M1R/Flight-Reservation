package com.flight_reservation.repository;

import com.flight_reservation.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureCityAndArrivalCityAndDateOfDeparture(String departureCity, String arrivalCity,
            Date dateOfDeparture);
}
