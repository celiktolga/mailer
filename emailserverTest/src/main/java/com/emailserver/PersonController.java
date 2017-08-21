package com.emailserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	private static final Logger logger = LoggerFactory
			.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/sendByGmail", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmailEntity emailEntity) {
		System.out.println("sending email ....");
		logger.info("sending email ....");
		String addEmployeeResult = personService.savePerson(emailEntity);
		return addEmployeeResult;
	}

	@RequestMapping(value = "/sendByGmailEntity", method = RequestMethod.POST)
	public EmailEntity addEmployeeEntity(@RequestBody EmailEntity emailEntity) {
		System.out.println("sending email ....");
		logger.info("sendByGmailEntity ....");
		// String addEmployeeResult = personService.savePerson(emailEntity);
		EmailEntity emailEntity2 = personService.savePersonEntity(emailEntity);
		return emailEntity2;
	}
	
	
	@RequestMapping(value = "/sendByGmailGET", method = RequestMethod.GET)
	public EmailEntity addEmployeeGET() {
		System.out.println("sendinggettt email ....");
		logger.info("sendByGmailEntity ....");
		// String addEmployeeResult = personService.savePerson(emailEntity);
		EmailEntity emailEntity2 = personService.savePersonGET();
		return emailEntity2;
	}

}
