package com.springbootme.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Table(name = "address", schema = "public")
public class Address extends DomainObjectImpl {
	
	private String street1;
	private String street2;
	private String state;
	private String zip;
	

}
