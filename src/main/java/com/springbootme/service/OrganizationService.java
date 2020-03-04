package com.springbootme.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootme.domain.Organization;
import com.springbootme.repository.OrganizationRepository;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository repo;
	
	public Organization findById(UUID id) {
		return repo.findById(id);
	}
	

}
