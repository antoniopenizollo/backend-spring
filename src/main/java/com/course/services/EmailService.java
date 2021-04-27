package com.course.services;

import org.springframework.mail.SimpleMailMessage;

import com.course.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}