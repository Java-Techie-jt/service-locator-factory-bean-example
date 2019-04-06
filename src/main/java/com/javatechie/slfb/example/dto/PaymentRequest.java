package com.javatechie.slfb.example.dto;

import lombok.Data;

@Data
public class PaymentRequest {
	private long amount;
	private String paymentMethod;

}
