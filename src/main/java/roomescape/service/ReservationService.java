package roomescape.service;

import java.util.List;
import org.springframework.stereotype.Service;
import roomescape.domain.Reservation;
import roomescape.dto.request.ReservationPreservationRequest;
import roomescape.dto.response.ReservationPreservationResponse;
import roomescape.dto.response.TotalReservationRetrieval;
import roomescape.repository.ReservationRepository;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(final ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<TotalReservationRetrieval> findAll() {
        List<Reservation> reservations = reservationRepository.findAll();
        return reservations.stream()
                .map(TotalReservationRetrieval::from)
                .toList();
    }

    public ReservationPreservationResponse save(final ReservationPreservationRequest request) {
        Reservation savedReservation = reservationRepository.save(new Reservation(request.name(), request.date(), request.time()));
        return ReservationPreservationResponse.from(savedReservation);
    }
}
