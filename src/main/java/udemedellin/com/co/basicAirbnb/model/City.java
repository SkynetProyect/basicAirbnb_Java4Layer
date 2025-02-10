package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="city")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String coords;

}
