package com.flight_reservation.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDto {
    private Long id;
    private String airLine;
    private String departureCity;
    private String arrivalCity;
    private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;
}
