package com.emailserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import jodd.mail.Email;
import jodd.mail.EmailAddress;
import jodd.mail.SendMailSession;
import jodd.mail.SmtpSslServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
  
@Service
public class PersonService {

	@Value("${email.username}")
	private String username;

	@Value("${email.personal}")
	private String personal;

	@Autowired
	private SendMailSession session;
	
	public static final String TEMPLATE = "D:\\Spring_boot_project\\emailserverTest\\src\\main\\java\\com\\emailserver\\fm_mailTemplate.txt";
//    private static final String DICTIONARY_FILE = "C:\\myfolder\\deneme.txt";

	public String savePerson(EmailEntity emailEntity) {

		// final String username = "azimlideveloper@gmail.com";
		// final String password = "14531453qq";
		// tolgaclk7@gmail.com
		Email email = null;
		String result = null;
		System.out.println("EmailAddress=" + emailEntity.getEmailAddress());
		String content;
		try {
			content = new String(
					Files.readAllBytes(Paths
							.get(TEMPLATE)));
			// email = Email.create().from("KING", username).to(emailAddress)
			// .subject("Selam "
			// +emailEntity.getRecieverName()).addText("Test messaj ...")
			// .addHtml(content);

			email = Email.create().from(personal, username);
			email.to(emailEntity.getEmailAddress());
			email.subject("Selam " + emailEntity.getRecieverName());
			email.addText("Test messaj ...");
			// email.cc("celiktolga.work@gmail.com");
			email.addHtml(content);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Session yaratlıyor...");

		try {
			session.open();
			session.sendMail(email);
			session.close();
			result = "Email sent.";
			System.out.println(result);
		} catch (Exception e) {
			result = e.getMessage();
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public EmailEntity savePersonEntity(EmailEntity emailEntity) {

		// final String username = "azimlideveloper@gmail.com";
		// final String password = "14531453qq";
		// tolgaclk7@gmail.com
		Email email = null;
		String result = null;
		System.out.println("EmailAddress=" + emailEntity.getEmailAddress());
		String content;
		try {
			content = new String(
					Files.readAllBytes(Paths
							.get(TEMPLATE)));
			// email = Email.create().from("KING", username).to(emailAddress)
			// .subject("Selam "
			// +emailEntity.getRecieverName()).addText("Test messaj ...")
			// .addHtml(content);

			email = Email.create().from(personal, username);
			email.to(emailEntity.getEmailAddress());
			email.subject("Selam " + emailEntity.getRecieverName());
			email.addText("Test messaj ...");
			// email.cc("celiktolga.work@gmail.com");
			email.addHtml(content);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Session yaratlıyor...");

		try {
			session.open();
			session.sendMail(email);
			session.close();
			result = "Email sent.";
			System.out.println(result);
		} catch (Exception e) {
			result = e.getMessage();
			System.out.println(e.getMessage());
		}
		return emailEntity;
	}
	
	
	public EmailEntity savePersonGET() {

		// final String username = "azimlideveloper@gmail.com";
		// final String password = "14531453qq";
		// tolgaclk7@gmail.com
		Email email = null;
		EmailEntity emailEntity = new EmailEntity();
		emailEntity.setEmailAddress("tolgaclk7@gmail.com");
		String result = null;
		System.out.println("EmailAddress=" + emailEntity.getEmailAddress());
		String content;
		try {
			content = new String(
					Files.readAllBytes(Paths
							.get(TEMPLATE)));
			// email = Email.create().from("KING", username).to(emailAddress)
			// .subject("Selam "
			// +emailEntity.getRecieverName()).addText("Test messaj ...")
			// .addHtml(content);

			email = Email.create().from(personal, username);
			email.to(emailEntity.getEmailAddress());
			email.subject("Selam " + emailEntity.getRecieverName());
			email.addText("Test messaj ...");
			// email.cc("celiktolga.work@gmail.com");
			email.addHtml(content);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Session yaratlıyor...");

		try {
			session.open();
			session.sendMail(email);
			session.close();
			result = "Email sent.";
			System.out.println(result);
		} catch (Exception e) {
			result = e.getMessage();
			System.out.println(e.getMessage());
		}
		return emailEntity;
	}

//	@RequestMapping(value = "/getEmail", method = RequestMethod.GET, produces = "application/json")
//	public EmailEntity getEmail() {
//		EmailEntity emailEntity = new EmailEntity();
//		emailEntity.setEmailAddress(username);
//		emailEntity.setRecieverName(personal);
//		return emailEntity;
//	}
	
//	@ResponseBody @RequestMapping("/description")
//	public String getDescription(@RequestBody EmailEntity emailEntity){
//	    return "Succefull="+stats.getFirstName() + " " + stats.getLastName() + " hates wacky wabbits";
//	}

	@RequestMapping(value = "/getEmail", method = RequestMethod.GET, produces = "application/json")
	public EmailEntity getEmail() {
		EmailEntity emailEntity = new EmailEntity();
		emailEntity.setEmailAddress("tolgaclk7@gmail.com");
		emailEntity.setEmailPeriod("12");
		emailEntity.setRecieverName("Tolga");
		return emailEntity;
	}
}
