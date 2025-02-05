package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.Neighborhood;
import udemedellin.com.co.basicAirbnb.repository.NeighborhoodRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NeighborhoodService {

    private final NeighborhoodRepository neighborhoodRepository;

    public List<Neighborhood> getAll(){
        return neighborhoodRepository.findAll();
    }

    public Optional<Neighborhood> find(Integer id){
        return neighborhoodRepository.findById(id);
    }

    public Neighborhood save(Neighborhood neighborhood){
        return neighborhoodRepository.save(neighborhood);
    }

    public Boolean delete(Integer id){
        neighborhoodRepository.deleteById(id);
        return neighborhoodRepository.findById(id).isPresent();
    }

}
