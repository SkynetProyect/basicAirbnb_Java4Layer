package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.House;
import udemedellin.com.co.basicAirbnb.repository.HouseRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HouseService {


    private final HouseRepository houseRepository;

    public List<House> getAll(){
        return houseRepository.findAll();
    }

    public List<House> getByNeighborhood( Integer id){
        return houseRepository.findAll().stream()
                .filter(house -> house.getIdNeighborhood().equals(id)).toList();
    }

    public Optional<House> find(Integer id){
        return houseRepository.findById(id);
    }

    public House save(House house){
        return houseRepository.save(house);
    }

    public House saveImage(House house){
        return houseRepository.save(house);
    }

    public Boolean delete(Integer id){
        houseRepository.deleteById(id);
        return houseRepository.findById(id).isPresent();
    }


}
