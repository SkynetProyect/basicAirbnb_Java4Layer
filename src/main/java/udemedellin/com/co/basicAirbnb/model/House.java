package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="house")

public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idNeighborhood;
    private String address;
    private float price;
    private byte[] image = new byte[0];
}
