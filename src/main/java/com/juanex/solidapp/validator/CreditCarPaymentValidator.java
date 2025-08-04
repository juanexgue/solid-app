package com.juanex.solidapp.validator;

import com.juanex.solidapp.model.PaymentRequest;
import org.springframework.stereotype.Component;

@Component
class CreditCarPaymentValidator {
    public boolean isValid(PaymentRequest request) {
        return true;
    }
}
