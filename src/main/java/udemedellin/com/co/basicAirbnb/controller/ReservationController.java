package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.Reservation;
import udemedellin.com.co.basicAirbnb.service.ReservationService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }

    @GetMapping("/{id}")
    public Reservation get(@PathVariable Integer id) {
        Optional<Reservation> reservation = reservationService.find(id);
        return reservation.orElseGet(Reservation::new);
    }

    @GetMapping("getByUser/{id}")
    public List<Reservation> getByUser(@PathVariable Integer id) {
        return reservationService.getByUser(id);
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return reservationService.delete(id);
    }


}