package com.juanex.solidapp.service;

import com.juanex.solidapp.exception.PaymentException;
import com.juanex.solidapp.model.PaymentRequest;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentProcessor {
    private final Map<String, PaymentService> services;

    public PaymentProcessor(List<PaymentService> services) {
        this.services = services.stream().collect(Collectors.toMap(PaymentService::getType, Function.identity()));
    }

    public void handle(PaymentRequest request) {
        PaymentService service = this.services.get(request.getType());
        if(service == null) throw new PaymentException("Tipo no soportado");
        service.process(request);
    }
}
