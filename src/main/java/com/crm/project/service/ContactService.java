package com.crm.project.service;

import java.util.List;

import com.crm.project.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> getAllContact();

	Contact getContactById(long id);

	

}
