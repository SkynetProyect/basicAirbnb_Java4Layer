package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.Payment;
import udemedellin.com.co.basicAirbnb.repository.PaymentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PaymentService {


    private final PaymentRepository paymentRepository;

    public List<Payment> getAll(){

        return paymentRepository.findAll();
    }

    public Optional<Payment> find(Integer id){
        return paymentRepository.findById(id);
    }

    public Payment save(Payment payment){
        return paymentRepository.save(payment);
    }

    public Boolean delete(Integer id){
        paymentRepository.deleteById(id);
        return paymentRepository.findById(id).isPresent();
    }

}
