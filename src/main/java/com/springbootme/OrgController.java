/**
 * 
 */
package com.springbootme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootme.domain.Organization;
import com.springbootme.repository.OrganizationRepository;

/**
 * @author jjhancock
 *
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class OrgController
{
	
	@Autowired
	public OrganizationRepository orgRepo;

	@RequestMapping("/orgs")
	public Iterable<Organization> getOrgs() {
		return orgRepo.findAll();
	}

}
