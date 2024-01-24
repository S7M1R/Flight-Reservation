package com.flight_reservation.services.ServicesIMPL;

import com.flight_reservation.entity.Flight;
import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.repository.FlightRepository;
import com.flight_reservation.services.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServicesIMPL implements FlightServices {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<FlightDto> findFlight(String from, String to, Date dateOfDeparture) {
        List<Flight> flights = flightRepository.findFlights(from, to, dateOfDeparture);
        List<FlightDto> flightDtos = new ArrayList<>();
        for (Flight flight : flights) {
            FlightDto flightDto = new FlightDto();
            flightDto.setFlightNo(flight.getFlightNo());
            flightDto.setAirLine(flight.getAirLine());
            flightDto.setArrivalCity(flight.getArrivalCity());
            flightDto.setDepartureCity(flight.getDepartureCity());
            flightDto.setDateOfDeparture(flight.getDateOfDeparture());
            flightDto.setEstimatedDepartureTime(flight.getEstimatedDepartureTime());
            flightDtos.add(flightDto);
        }
        return flightDtos;
    }
}
