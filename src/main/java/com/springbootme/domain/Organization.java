/**
 * 
 */
package com.springbootme.domain;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.SortNatural;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	private Set<User> users;
	
	@SortNatural
	@OneToMany(fetch=FetchType.LAZY, mappedBy="owningOrg", targetEntity=User.class) 
	@Cascade(value = org.hibernate.annotations.CascadeType.DELETE)
	public Set<User> getUsers()
	{
		return users == null ? new TreeSet<User>() : users;
	}

	public void setUsers(Set<User> users)
	{
		this.users = users;
	}
	

}
