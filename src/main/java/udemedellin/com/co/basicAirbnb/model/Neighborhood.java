package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="neighborhood")

public class Neighborhood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idCity;
    private String name;

}
