package com.example.gsws_ap_ch10_p1.service;

import com.example.gsws_ap_ch10_p1.exception.NotEnoughMoneyException;
import com.example.gsws_ap_ch10_p1.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
