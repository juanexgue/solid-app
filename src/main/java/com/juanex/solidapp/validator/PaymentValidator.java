package com.juanex.solidapp.validator;

import com.juanex.solidapp.model.PaymentRequest;

public interface PaymentValidator {
    boolean isValid(PaymentRequest request);
}
