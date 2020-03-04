/**
 * 
 */
package com.springbootme.domain;

import java.util.Date;
import java.util.UUID;

/**
 * @author jhancock
 *
 */
public interface DomainObject {

	UUID getId();

	void setId(UUID id);

	Date getCreated();

	void setCreated(Date created);

	Date getUpdated();

	void setUpdated(Date updated);

	String getUpdatedBy();

	void setUpdatedBy(String updatedBy);

	String getDescription();

	void setDescription(String description);
	
	String getCreatedBy();
	
	void setCreatedBy(String createdBy);

}
