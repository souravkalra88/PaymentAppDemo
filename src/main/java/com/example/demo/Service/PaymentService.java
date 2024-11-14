package com.example.demo.Service;

import com.example.demo.DTO.PaymentRequest;
import com.example.demo.DTO.PaymentResponse;
import com.example.demo.Entity.PaymentEntity;
import com.example.demo.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest internatRequestObj) {
        PaymentEntity paymentModel = paymentRepository.getPaymentById(internatRequestObj);

        //map it to response obj
        return mapModelToResponseDTO(paymentModel);
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity) {

        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return response;
    }
}
