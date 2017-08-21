package com.emailserver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import jodd.mail.Email;
import jodd.mail.SendMailSession;
import jodd.mail.SmtpSslServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfigClass {

	private final Logger logger = LoggerFactory
			.getLogger(MailConfigClass.class);

	@Value("${email.host}")
	private String host;

	@Value("${email.port}")
	private Integer port;

	@Value("${email.username}")
	private String username;

	@Value("${email.password}")
	private String password;

	// @Bean
	// public Email javaEMailService() {
	// Email email = new Email();
	//
	// String content;
	//
	// try {
	// content = new String(
	// Files.readAllBytes(Paths
	// .get("C:/Users/TOLGA/workspace/TestEmailV1/src/com/send/fm_mailTemplate.txt")));
	// email = Email.create().from("KING", username)
	// // .to(emailEntity.getEmailAddress())
	// // .subject("Selam " + emailEntity.getRecieverName())
	// .addText("Test messaj ...").addHtml(content);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// // SendMailSession session = SmtpSslServer.create(host)
	// // .authenticateWith(username, password).createSession();
	//
	// return email;
	// }

	@Bean
	public SendMailSession javaSendMailSessionService() {
		logger.info("This is an javaSendMailSessionService");
		SendMailSession session = SmtpSslServer.create(host)
				.authenticateWith(username, password).createSession();
		System.out.println("SendMailSession is created.");
		return session;
	}

	// private Properties getMailProperties() {
	// Properties props = new Properties();
	// props.put("mail.smtp.starttls.enable", "true");
	// props.put("mail.smtp.debug", "true");
	// props.put("mail.smtp.auth", "true");
	// props.put("mail.smtp.socketFactory.class",
	// "javax.net.ssl.SSLSocketFactory");
	// props.put("mail.smtp.socketFactory.fallback", "false");
	//
	// return props;
	// }
}