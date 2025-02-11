package udemedellin.com.co.basicAirbnb.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idHouse;
    private Integer idUsuario;
    private Timestamp startDate;
    private Timestamp endDate;

}
