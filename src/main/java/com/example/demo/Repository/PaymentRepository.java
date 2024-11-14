package com.example.demo.Repository;

import com.example.demo.DTO.PaymentRequest;
import com.example.demo.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request) {
        return executeQuery(request);
    }

    private PaymentEntity executeQuery(PaymentRequest request){
        //connect with DB and fetch the data
        PaymentEntity payment = new PaymentEntity();
        payment.setId(request.getPaymentID());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }
}
