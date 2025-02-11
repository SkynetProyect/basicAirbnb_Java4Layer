package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String pass;



}
