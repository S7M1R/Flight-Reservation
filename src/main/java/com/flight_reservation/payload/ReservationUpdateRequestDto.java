package com.flight_reservation.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationUpdateRequestDto {
    private Long id;
    private Boolean checkedIn;
    private int numberOfBags;
}
