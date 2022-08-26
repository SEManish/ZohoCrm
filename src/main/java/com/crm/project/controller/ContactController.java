package com.crm.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.project.entity.Contact;
import com.crm.project.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping("/allContacts")
	public String getAllContacts(ModelMap modelMap) {
		List<Contact> contacts = contactService.getAllContact();
		modelMap.addAttribute("contact", contacts);
		return "contactList";
	}
	@RequestMapping("/generateBill")
	public String contactByID(@RequestParam("id") long id,ModelMap modelMap) {
		Contact contact = contactService.getContactById(id);
		modelMap.addAttribute("contact", contact);
		return "do_billing";
	}
}
