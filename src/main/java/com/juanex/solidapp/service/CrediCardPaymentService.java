package com.juanex.solidapp.service;

import com.juanex.solidapp.model.PaymentRequest;
import org.springframework.stereotype.Service;

@Service
public class CrediCardPaymentService implements PaymentService {

    @Override
    public void process(PaymentRequest request) {
        System.out.println("Credit card payment: " + request.getAmount());
    }

    @Override
    public String getType() {
        return "creditcard";
    }


}
