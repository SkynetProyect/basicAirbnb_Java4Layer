package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.City;
import udemedellin.com.co.basicAirbnb.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService {


    private final CityRepository cityRepository;

    public List<City> getAll(){
        return cityRepository.findAll();
    }

    public Optional<City> find(Integer id){
        return cityRepository.findById(id);
    }

    public City save(City city){
        return cityRepository.save(city);
    }

    public Boolean delete(Integer id){
        cityRepository.deleteById(id);
        return cityRepository.findById(id).isPresent();
    }


}
