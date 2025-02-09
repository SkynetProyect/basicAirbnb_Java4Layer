package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.House;
import udemedellin.com.co.basicAirbnb.service.HouseService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/house")
@AllArgsConstructor
public class HouseController {
    private final HouseService houseService;

    @GetMapping("/all")
    public List<House> getAll(){
        return houseService.getAll();
    }

    @GetMapping("/byNeighborhood/{id}")
    public List<House> getByNeighborhood(@PathVariable Integer id){
        return houseService.getByNeighborhood(id);
    }

    @GetMapping("/{id}")
    public House get(@PathVariable Integer id){
        Optional<House> house = houseService.find(id);
        return house.orElseGet(House::new);
    }

    @PostMapping
    public House create(@RequestBody House house){
        return houseService.save(house);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return houseService.delete(id);
    }


}
