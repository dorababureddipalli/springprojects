package com.services;

import org.springframework.stereotype.Service;

import com.entities.Contact;

@Service
public interface ContactService {
	public String emailValidator(String email);

	public Contact addContact(Contact contact);
}
