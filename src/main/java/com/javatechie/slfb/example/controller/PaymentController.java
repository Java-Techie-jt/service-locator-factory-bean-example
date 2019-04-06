package com.javatechie.slfb.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.slfb.example.dto.PaymentRequest;
import com.javatechie.slfb.example.service.AmazonPay;
import com.javatechie.slfb.example.service.PaymentRegistry;
import com.javatechie.slfb.example.service.Paytm;
import com.javatechie.slfb.example.service.PhonePe;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

	@Autowired
	PaymentRegistry registry;

	/*
	 * @Autowired private Paytm paytm;
	 * 
	 * @Autowired private PhonePe phonePe;
	 * 
	 * @Autowired private AmazonPay ap;
	 */

	/*
	 * @PostMapping("/pay") public String payNow(@RequestBody PaymentRequest
	 * request) { String response = ""; if
	 * (request.getPaymentMethod().equals("Paytm")) { response = paytm.pay(request);
	 * } if (request.getPaymentMethod().equals("PhonePe")) { response =
	 * phonePe.pay(request); } if (request.getPaymentMethod().equals("AmazonPay")) {
	 * response = ap.pay(request); } return response; }
	 */

	@PostMapping("/pay")
	public String paymentProcess(@RequestBody PaymentRequest request) {
		String response = "";
		response = registry.getServiceBean(request.getPaymentMethod()).pay(request);
		return response;
	}

}
