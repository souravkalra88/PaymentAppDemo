package com.example.demo.Controller;

import com.example.demo.DTO.PaymentRequest;
import com.example.demo.DTO.PaymentResponse;
import com.example.demo.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id) {
        // Map Data
        PaymentRequest internalRequestObj = new PaymentRequest();
        internalRequestObj.setPaymentID(id);

        PaymentResponse payment = paymentService.getPaymentDetailsById(internalRequestObj);

        // return the Response DTO
        return ResponseEntity.ok(payment);
    }
}
