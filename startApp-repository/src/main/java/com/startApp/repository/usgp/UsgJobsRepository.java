/**
 * 
 */
package com.startApp.repository.usgp;

import java.util.List;

import com.startApp.domain.Company;

/**
 * @author x085982
 *
 */
public interface UsgJobsRepository {
	public List<Company> getAllAvailableJobs(String query);
}
