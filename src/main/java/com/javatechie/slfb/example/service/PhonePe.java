package com.javatechie.slfb.example.service;

import org.springframework.stereotype.Service;

import com.javatechie.slfb.example.dto.PaymentRequest;

@Service("PhonePe")
public class PhonePe implements PaymentService {
	@Override
	public String pay(PaymentRequest request) {
		return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
	}
}
