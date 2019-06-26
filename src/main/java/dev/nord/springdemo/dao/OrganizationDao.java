package dev.nord.springdemo.dao;

import java.util.List;
import javax.sql.DataSource;
import dev.nord.springdemo.domain.Organization;

public interface OrganizationDao {
	
	// Set the data-source for database connection
	public void setDataSource(DataSource dataSource);
	
	// Create a record in the organization table
	public boolean create(Organization org);
	
	// Retreive a single organization
	public Organization getOrganization(Integer id);
	
	// Retreive all organisations from the table
	public List<Organization> getAllOrganizations();
	
	// Delete a specifico organization from the table
	public boolean delete(Organization org);
	
	// Update an existing organization
	public boolean update(Organization org);
	
	public void cleanup();

}
