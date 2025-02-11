package udemedellin.com.co.basicAirbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udemedellin.com.co.basicAirbnb.model.Puntuacion;
import udemedellin.com.co.basicAirbnb.model.Usuario;

@Repository
public interface PuntuacionRepository extends JpaRepository<Puntuacion, Integer> {

}
