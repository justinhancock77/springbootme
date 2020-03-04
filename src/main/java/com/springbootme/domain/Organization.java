/**
 * 
 */
package com.springbootme.domain;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author jhancock
 *
 */
@Data
@SuperBuilder
@Builder
@Access(value=AccessType.PROPERTY)
@Entity(name = "organization")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORGANIZATION", schema = "public")
public class Organization extends DomainObjectImpl {
	
	private String orgName;
	
	private Set<User> users;
	
	@OneToMany(mappedBy="id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Set<User> getUsers() {
		return this.users;
	}
	
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	

}
