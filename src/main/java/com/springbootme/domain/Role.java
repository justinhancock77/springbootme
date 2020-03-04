/**
 * 
 */
package com.springbootme.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author jhancock
 *
 */
@SuperBuilder
@Data
@Entity(name = "role")
@Table(name = "ROLE", schema = "public")
public class Role extends DomainObjectImpl
{
	private UUID id;
	private String name;
}
