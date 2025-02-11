package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.Puntuacion;
import udemedellin.com.co.basicAirbnb.repository.PuntuacionRepository;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PuntuacionService {

    private final PuntuacionRepository puntuacionRepository;

    public List<Puntuacion> getAll(){
        return puntuacionRepository.findAll();
    }

    public Optional<Puntuacion> find(Integer id){
        return puntuacionRepository.findById(id);
    }

    public Puntuacion save(Puntuacion puntuacion){
        return puntuacionRepository.save(puntuacion);
    }

    public Boolean delete(Integer id){
        puntuacionRepository.deleteById(id);
        return puntuacionRepository.findById(id).isPresent();
    }

}
