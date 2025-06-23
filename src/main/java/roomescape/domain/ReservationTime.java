package roomescape.domain;

import jakarta.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
public class ReservationTime {

    private LocalTime time;

    public ReservationTime(final LocalTime time) {
        this.time = time;
    }

    public ReservationTime() {
    }

    public LocalTime getTime() {
        return time;
    }
}
