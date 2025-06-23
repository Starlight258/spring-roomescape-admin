package roomescape.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;
import roomescape.domain.Reservation;

public record ReservationPreservationResponse(Long id, String name, LocalDate date, LocalTime time) {

    public static ReservationPreservationResponse from(final Reservation reservation) {
        return new ReservationPreservationResponse(reservation.getId(), reservation.getName().getName(),
                reservation.getDate().getDate(), reservation.getTime().getTime());
    }
}
