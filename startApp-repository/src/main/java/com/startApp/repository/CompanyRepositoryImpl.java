/**
 * 
 */
package com.startApp.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.startApp.domain.Company;

/**
 * @author x085982
 *
 */
@Repository
public class CompanyRepositoryImpl implements CompanyRepository {
	

	public List<Company> getAllSampleCompanies() {
		
		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate.getForObject("http://kvkhackathon.azurewebsites.net/api/companies/Sample", Company[].class);
		return Arrays.asList(companies);
	}
}
