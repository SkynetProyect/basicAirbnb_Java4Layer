package udemedellin.com.co.basicAirbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udemedellin.com.co.basicAirbnb.model.Payment;
@Repository
public interface PaymentRepository  extends JpaRepository<Payment, Integer> {
}
