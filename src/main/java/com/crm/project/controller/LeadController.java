package com.crm.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.project.entity.Contact;
import com.crm.project.entity.Lead;
import com.crm.project.service.ContactService;
import com.crm.project.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@Autowired
	ContactService contactService;

	@RequestMapping("/")
	public String openLeadPage() {
		return "leadPage";
	}

	@RequestMapping("/insertLead")
	public String insertLead(@ModelAttribute("lead") Lead lead, ModelMap modelMap) {
		leadService.insertData(lead);
		List<Lead> leads = leadService.getAllLead();
		modelMap.addAttribute("lead", leads);
		return "leadResult";

	}

	@RequestMapping("/listAll")
	public String getAllLead(ModelMap modelMap) {
		List<Lead> leads = leadService.getAllLead();
		modelMap.addAttribute("lead", leads);
		return "leadResult";
	}

	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap modelMap) {
		Lead lead = leadService.getLeadById(id);
		modelMap.addAttribute("lead", lead);
		return "leadInfo";
	}

	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap modelMap) {
		Lead lead = leadService.getLeadById(id);
		
		Contact contact=new Contact();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		leadService.deleteLead(id);
		
		List<Contact> contacts = contactService.getAllContact();
		modelMap.addAttribute("contact", contacts);
		return "contactList";
		
	}
}
