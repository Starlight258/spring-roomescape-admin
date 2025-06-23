package roomescape.dto.response;

import static roomescape.common.LocalTimeUtils.truncatedLocalTimeByMinutes;

import java.time.LocalTime;
import roomescape.domain.Reservation;

public record TotalReservationRetrieval(Long id, String name, String date, String time) {

    public static TotalReservationRetrieval from(Reservation reservation) {
        LocalTime truncatedLocalTime = truncatedLocalTimeByMinutes(reservation.getTime().getTime());
        return new TotalReservationRetrieval(reservation.getId(), reservation.getName().getName(),
                reservation.getDate().getDate().toString(),
                truncatedLocalTime.toString());
    }
}
