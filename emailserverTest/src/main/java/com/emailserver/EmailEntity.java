package com.emailserver;

import javax.persistence.Entity;

 
public class EmailEntity {

	private Integer id;
	private String emailAddress;
	private String emailPeriod;
	private String recieverName;
	private String emailPassword;
	private String status;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailPeriod() {
		return emailPeriod;
	}

	public void setEmailPeriod(String emailPeriod) {
		this.emailPeriod = emailPeriod;
	}

	public String getRecieverName() {
		return recieverName;
	}

	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
