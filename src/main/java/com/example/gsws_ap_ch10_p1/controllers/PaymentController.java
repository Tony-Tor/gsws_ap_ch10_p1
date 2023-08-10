package com.example.gsws_ap_ch10_p1.controllers;

import com.example.gsws_ap_ch10_p1.exception.NotEnoughMoneyException;
import com.example.gsws_ap_ch10_p1.model.ErrorDetails;
import com.example.gsws_ap_ch10_p1.model.PaymentDetails;
import com.example.gsws_ap_ch10_p1.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);

    }
}
