package com.juanex.solidapp.service;

import com.juanex.solidapp.model.PaymentRequest;

public interface PaymentService {
    void process(PaymentRequest request);
    String getType();
}
