package com.springbootme.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootme.domain.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

	public Organization findById(UUID id);

}
