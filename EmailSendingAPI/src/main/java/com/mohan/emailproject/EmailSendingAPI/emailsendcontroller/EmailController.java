package com.mohan.emailproject.EmailSendingAPI.emailsendcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohan.emailproject.EmailSendingAPI.emailservice.EmailSendService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailSendService emailSendService;
	
	@GetMapping("/sendemail")
	public String sendEmail() {
		var msg="dfghjk";
		
		emailSendService.sendEmailMethod("test@gmail.com", "test", "test");
		return "sent succesfully";
		
	}

}
