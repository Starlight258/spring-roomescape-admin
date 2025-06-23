package roomescape.domain;

import jakarta.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class ReservationDate {

    private LocalDate date;

    public ReservationDate(final LocalDate date) {
        this.date = date;
    }

    protected ReservationDate() {
    }

    public LocalDate getDate() {
        return date;
    }
}
