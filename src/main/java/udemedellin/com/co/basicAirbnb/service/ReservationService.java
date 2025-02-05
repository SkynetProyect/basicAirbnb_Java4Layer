package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.repository.ReservationRepository;
import udemedellin.com.co.basicAirbnb.model.Reservation;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService {


    private final ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.findAll();
    }

    public Optional<Reservation> find(Integer id){
        return reservationRepository.findById(id);
    }

    public Reservation save(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public Boolean delete(Integer id){
        reservationRepository.deleteById(id);
        return reservationRepository.findById(id).isPresent();
    }

}
