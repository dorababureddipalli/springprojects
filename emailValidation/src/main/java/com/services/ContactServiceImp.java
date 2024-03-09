package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Contact;
import com.repositories.ContactRepository;
@Service
public class ContactServiceImp implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public String emailValidator(String email) {
		String findBycontactEmail = contactRepo.findByContactEmail(email);
		if (findBycontactEmail != null)
			return "Duplicate";
		else
			return "unique";
	}

	@Override
	public Contact addContact(Contact contact) {

		Contact save = contactRepo.save(contact);

		return save;
	}

}
