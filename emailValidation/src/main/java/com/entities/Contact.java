package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTACTS")
public class Contact {
//	@Id
//	@GeneratedValue
//	private Integer contactId;
	@Column(name = "CONTACT_NAME" ,nullable = false,unique = true )
	private String contactName;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Id
	@Column(name = "CONTACT_MOBILENO")
	private Long contactMobileNO;

	public Contact() {
		super();

	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactMobileNO() {
		return contactMobileNO;
	}

	public void setContactMobileNO(Long contactMobileNO) {
		this.contactMobileNO = contactMobileNO;
	}

}
