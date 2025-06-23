package roomescape.dto;

import static roomescape.common.LocalTimeUtils.truncatedLocalTimeByMinutes;

import java.time.LocalTime;
import roomescape.domain.Reservation;

public record TotalReservationRetrieval(Long id, String name, String date, String time) {

    public static TotalReservationRetrieval from(Reservation reservation) {
        LocalTime truncatedLocalTime = truncatedLocalTimeByMinutes(reservation.getTime());
        return new TotalReservationRetrieval(reservation.getId(), reservation.getName(), reservation.getDate().toString(),
                truncatedLocalTime.toString());
    }
}
