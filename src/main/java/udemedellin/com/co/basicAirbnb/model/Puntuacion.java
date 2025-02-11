package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="puntuacion")
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idUsuario;
    private Integer idHouse;
    private Integer amount;



}
