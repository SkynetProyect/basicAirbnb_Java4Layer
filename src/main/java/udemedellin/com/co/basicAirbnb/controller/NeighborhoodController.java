package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.Neighborhood;
import udemedellin.com.co.basicAirbnb.service.NeighborhoodService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/neighborhood")
@AllArgsConstructor
public class NeighborhoodController {
    private final NeighborhoodService neighborhoodService;

    @GetMapping("/all")
    public List<Neighborhood> getAll(){
        return neighborhoodService.getAll();
    }

    @GetMapping("/byCity/{id}")
    public List<Neighborhood> getByCity(@PathVariable Integer id){return  neighborhoodService.getByCity(id);}

    @GetMapping("/{id}")
    public Neighborhood get(@PathVariable Integer id){
        Optional<Neighborhood> neighborhood = neighborhoodService.find(id);
        return neighborhood.orElseGet(Neighborhood::new);
    }

    @PostMapping
    public Neighborhood create(@RequestBody Neighborhood neighborhood){
        return neighborhoodService.save(neighborhood);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return neighborhoodService.delete(id);
    }


}

