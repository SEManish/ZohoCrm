package com.crm.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.project.entity.Lead;
import com.crm.project.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	LeadRepository leadRepo;

	@Override
	public void insertData(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLead() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteLead(long id) {

		leadRepo.deleteById(id);
	}

}
