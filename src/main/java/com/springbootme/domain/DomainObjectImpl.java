/**
 * 
 */
package com.springbootme.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author jhancock
 *
 */
@SuppressWarnings("serial")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class DomainObjectImpl implements DomainObject, Serializable {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", columnDefinition = "VARCHAR(255)")
	private UUID id;

	@Column(name = "description", updatable = true, nullable = true)
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", updatable = false, nullable = false)
	@CreationTimestamp
	private Date created;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated", updatable = true, nullable = false)
	@CreationTimestamp
	private Date updated;

	@Column(name = "updatedBy", updatable = true, nullable = false)
	@Builder.Default
	private String updatedBy = "System";

	@Column(name = "createdBy", updatable = false, nullable = false)
	@Builder.Default
	private String createdBy = "System";
	
	@Builder.Default
	@Column(name = "active", updatable = true, nullable = false)
	private boolean active = true;

}
