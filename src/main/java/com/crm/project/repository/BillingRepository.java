package com.crm.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.project.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
