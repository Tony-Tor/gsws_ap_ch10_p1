package com.example.gsws_ap_ch10_p1.advice;

import com.example.gsws_ap_ch10_p1.exception.NotEnoughMoneyException;
import com.example.gsws_ap_ch10_p1.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(Exception e) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to make the payment." + e);
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
