package roomescape.dto.request;

import java.time.LocalDate;
import java.time.LocalTime;

public record ReservationPreservationRequest(String name, LocalDate date, LocalTime time) {

}
