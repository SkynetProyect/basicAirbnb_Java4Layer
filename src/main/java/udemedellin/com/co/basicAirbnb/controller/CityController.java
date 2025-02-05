package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.City;
import udemedellin.com.co.basicAirbnb.service.CityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/all")
    public List<City> getAll(){
        return cityService.getAll();
    }

    @GetMapping("/{id}")
    public City get(@PathVariable Integer id){
        Optional<City> city = cityService.find(id);
        return city.orElseGet(City::new);
    }

    @PostMapping
    public City create(@RequestBody City city){
        return cityService.save(city);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return cityService.delete(id);
    }


}
