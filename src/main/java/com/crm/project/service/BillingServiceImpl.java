package com.crm.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.project.entity.Billing;
import com.crm.project.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	BillingRepository billingRepo;

	@Override
	public Billing generateBill(Billing bill) {
		return billingRepo.save(bill);
	}

}
