package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.Puntuacion;
import udemedellin.com.co.basicAirbnb.service.PuntuacionService;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/puntuacion")
@AllArgsConstructor
public class PuntuacionController {
    private final PuntuacionService puntuacionService;

    @GetMapping("/all")
    public List<Puntuacion> getAll(){
        return puntuacionService.getAll();
    }

    @GetMapping("/{id}")
    public Puntuacion get(@PathVariable Integer id){
        Optional<Puntuacion> puntuacion = puntuacionService.find(id);
        return puntuacion.orElseGet(Puntuacion::new);
    }

    @PostMapping
    public Puntuacion create(@RequestBody Puntuacion puntuacion){
        return puntuacionService.save(puntuacion);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return puntuacionService.delete(id);
    }


}
