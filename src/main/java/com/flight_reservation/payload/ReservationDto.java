package com.flight_reservation.payload;

import com.flight_reservation.entity.Flight;
import com.flight_reservation.entity.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
    private Long id;
    private Boolean checkedIn;
    private int noOfBags;
    private Passenger passenger;
    private Flight flight;
}
