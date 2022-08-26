package com.crm.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.project.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
