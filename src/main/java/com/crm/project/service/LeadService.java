package com.crm.project.service;

import java.util.List;

import com.crm.project.entity.Lead;

public interface LeadService {

	void insertData(Lead lead);

	List<Lead> getAllLead();

	Lead getLeadById(long id);

	void deleteLead(long id);

}
