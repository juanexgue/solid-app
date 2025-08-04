package com.juanex.solidapp.controller;

import com.juanex.solidapp.model.PaymentRequest;
import com.juanex.solidapp.service.PaymentProcessor;
import com.juanex.solidapp.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pagos")
public class PaymentController {
    private final PaymentProcessor processor;

    public PaymentController(PaymentProcessor processor) {
        this.processor = processor;
    }

    @PostMapping
    public ResponseEntity<String> pagar(@RequestBody PaymentRequest request) {
        processor.handle(request);
        return ResponseEntity.ok("Pago procesado");
    }
}
