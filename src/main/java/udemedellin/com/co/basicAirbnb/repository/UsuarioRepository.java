package udemedellin.com.co.basicAirbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udemedellin.com.co.basicAirbnb.model.City;
import udemedellin.com.co.basicAirbnb.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
