/**
 * 
 */
package com.startApp.repository.usgp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.startApp.domain.Company;

/**
 * @author x085982
 *
 */
@Repository
public class UsgJobsRepositoryImpl implements UsgJobsRepository {
	private AuthorisedRestTemplate authorisedRestTemplate;

	@Override
	public List<Company> getAllAvailableJobs(String query) {
		//Company[] companies = authorisedRestTemplate.getRestTemplate().getForObject(Constants.KVK_API_BASE_NAME + "/companies/city/" + city,
		return null;
	}
	
}