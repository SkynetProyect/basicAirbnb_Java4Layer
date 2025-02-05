package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.Payment;
import udemedellin.com.co.basicAirbnb.service.PaymentService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping("/all")
    public List<Payment> getAll(){
        return paymentService.getAll();
    }

    @GetMapping("/{id}")
    public Payment get(@PathVariable Integer id){
        Optional<Payment> payment = paymentService.find(id);
        return payment.orElseGet(Payment::new);
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentService.save(payment);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return paymentService.delete(id);
    }


}
