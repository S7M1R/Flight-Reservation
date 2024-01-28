package com.flight_reservation.services.ServicesIMPL;

import com.flight_reservation.entity.Flight;
import com.flight_reservation.entity.Passenger;
import com.flight_reservation.entity.Reservation;
import com.flight_reservation.payload.FlightDto;
import com.flight_reservation.payload.PassengerDto;
import com.flight_reservation.payload.ReservationDto;
import com.flight_reservation.payload.ReservationUpdateRequestDto;
import com.flight_reservation.repository.FlightRepository;
import com.flight_reservation.repository.PassengerRepository;
import com.flight_reservation.repository.ReservationRepository;
import com.flight_reservation.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServicesIMPL implements ReservationServices {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public FlightDto ViewReservations(long flightId) {
        Optional<Flight> flight = flightRepository.findById(flightId);
        Flight flightData = flight.get();
        FlightDto flightDto = new FlightDto();
        flightDto.setAirLine(flightData.getAirLine());
        flightDto.setArrivalCity(flightData.getArrivalCity());
        flightDto.setDepartureCity(flightData.getDepartureCity());
        flightDto.setDateOfDeparture(flightData.getDateOfDeparture());
        flightDto.setEstimatedDepartureTime(flightData.getEstimatedDepartureTime());
        return flightDto;
    }

    @Override
    public ReservationDto ConfirmReservation(PassengerDto passengerDto) {
        Passenger passenger = new Passenger();
        passenger.setFirstName(passengerDto.getFirstName());
        passenger.setLastName(passengerDto.getLastName());
        passenger.setEmail(passengerDto.getEmail());
        passenger.setMobile(passengerDto.getMobile());
        passengerRepository.save(passenger);
        long flightId = passengerDto.getFlightId();
        Flight flight = flightRepository.findById(flightId).get();
        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(passenger);
        reservation.setCheckedIn(false);
        reservation.setNoOfBags(0);
        Reservation reservedTicket = reservationRepository.save(reservation);
        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setId(reservedTicket.getId());
        reservationDto.setFlight(reservedTicket.getFlight());
        reservationDto.setPassenger(reservedTicket.getPassenger());
        reservationDto.setNoOfBags(reservedTicket.getNoOfBags());
        reservationDto.setCheckedIn(reservedTicket.getCheckedIn());
        return reservationDto;
    }

    @Override
    public Reservation findReservtaion(long id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequestDto request) {
        Reservation reservation = reservationRepository.findById(request.getId()).get();
        reservation.setCheckedIn(request.getCheckedIn());
        reservation.setNoOfBags(request.getNumberOfBags());
        return reservationRepository.save(reservation);
    }
}
