package com.mohan.emailproject.EmailSendingAPI.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {
	@Autowired
	JavaMailSender javaMailSender;

	@Value("spring.mail.username")
	private String userName;

	public void sendEmailMethod(String recipient, String body, String subject) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(userName);
		mailMessage.setTo(recipient);
		mailMessage.setText(body);
		mailMessage.setSubject(subject);
		javaMailSender.send(mailMessage);

	}
}
