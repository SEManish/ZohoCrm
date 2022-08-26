package com.crm.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.project.entity.Billing;
import com.crm.project.service.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	BillingService billingService;

	@RequestMapping("/billingResult")
	public String billing(@ModelAttribute("bill") Billing bill,ModelMap modelMap) {
		Billing Bill = billingService.generateBill(bill);
		modelMap.addAttribute("bill", Bill);

		return "memo_bill";
	}
}
