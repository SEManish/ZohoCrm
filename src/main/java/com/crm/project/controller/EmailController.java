package com.crm.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.project.utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	EmailService emailService;

	@RequestMapping("/composeEmail")
	public String composeMail(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "compose_email";

	}
@RequestMapping("/SendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("content") String content) {
		emailService.sendEmail(to,subject,content);
		return "compose_email";

	}
}
