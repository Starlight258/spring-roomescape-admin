package roomescape.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roomescape.dto.request.ReservationPreservationRequest;
import roomescape.dto.response.ReservationPreservationResponse;
import roomescape.dto.response.TotalReservationRetrieval;
import roomescape.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(final ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<TotalReservationRetrieval> findAll() {
        return reservationService.findAll();
    }

    @PostMapping
    public ResponseEntity<ReservationPreservationResponse> save(final @RequestBody ReservationPreservationRequest request) {
        ReservationPreservationResponse response = reservationService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
