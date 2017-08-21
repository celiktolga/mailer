package com.emailserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import jodd.mail.Email;
import jodd.mail.SendMailSession;
import jodd.mail.SmtpSslServer;
 


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
// @Controller
public class SendEmailV1 {
 
//	@RequestMapping(value = "/sendByGmail", method = RequestMethod.POST)
//	public String sendByGmail(@RequestBody  String emailAddress) {
//		// value = "emailAddress", defaultValue = "test"
//		final String username = "azimlideveloper@gmail.com";
//		final String password = "14531453qq";
//		// tolgaclk7@gmail.com
//		Email email = null;
//		String result = null;
//		System.out.println("emailAddress="+emailAddress);
//		String content;
//		try {
//			content = new String(
//					Files.readAllBytes(Paths
//							.get("C:/Users/TOLGA/workspace/TestEmailV1/src/com/send/fm_mailTemplate.txt")));
//			email = Email.create().from("KING", username).to(emailAddress)
//					.subject("Selam TOLGA! ").addText("Test messaj ...")
//					.addHtml(content);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//
//		try {
//			SendMailSession session = SmtpSslServer.create("smtp.gmail.com")
//					.authenticateWith(username, password).createSession();
//			session.open();
//			session.sendMail(email);
//			session.close();
//			result = "Email sent.";
//			System.out.println(result);
//		} catch (Exception e) {
//			result = e.getMessage();
//			System.out.println(e.getMessage());
//		}
//		return result;
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/sendByGmailTest", method = RequestMethod.POST)
//	public String sendByGmailTest(@RequestBody  EmailEntity emailEntity) {
//		// value = "emailAddress", defaultValue = "test"
//		final String username = "azimlideveloper@gmail.com";
//		final String password = "14531453qq";
//		// tolgaclk7@gmail.com
//		Email email = null;
//		String result = null;
//		System.out.println("EmailAddress="+ emailEntity.getEmailAddress());
//		String emailAddress= emailEntity.getEmailAddress();
//		System.out.println("emailAddress="+emailAddress);
//		String content;
//		try {
//			content = new String(
//					Files.readAllBytes(Paths
//							.get("C:/Users/TOLGA/workspace/TestEmailV1/src/com/send/fm_mailTemplate.txt")));
//			email = Email.create().from("KING", username).to(emailAddress)
//					.subject("Selam TOLGA! ").addText("Test messaj ...")
//					.addHtml(content);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//
//		try {
//			SendMailSession session = SmtpSslServer.create("smtp.gmail.com")
//					.authenticateWith(username, password).createSession();
//			session.open();
//			session.sendMail(email);
//			session.close();
//			result = "Email sent.";
//			System.out.println(result);
//		} catch (Exception e) {
//			result = e.getMessage();
//			System.out.println(e.getMessage());
//		}
//		return result;
//	}
	
 
	
//	@RequestMapping(value = "/getEmail", method = RequestMethod.GET, produces = "application/json")
//	public EmailEntity getEmail() {
//		EmailEntity emailEntity = new EmailEntity();
//		emailEntity.setEmailAddress("tolgaclk7@gmail.com");
//		emailEntity.setEmailPeriod("12");
//		emailEntity.setRecieverName("Tolga");
//		return emailEntity;
//	}

}
