/**
 * 
 */
package com.startApp.repository.kvk;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.startApp.domain.Company;
import com.startApp.utils.Constants;

/**
 * @author x085982
 *
 */
@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

	public List<Company> getAllSampleCompanies() {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate.getForObject(Constants.KVK_API_BASE_NAME + "/companies/Sample",
				Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByGps(String gpsLatitude, String gpsLongitude, String radius, String offset) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate.getForObject(Constants.KVK_API_BASE_NAME + "/companies/byGps?" + "latitude="
				+ gpsLatitude + "&longitude=" + gpsLongitude + "&radius=" + radius + "&offset=" + offset,
				Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByDescription(String description, String code, boolean mainDescriptionOnly,
			String offset) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate
				.getForObject(
						Constants.KVK_API_BASE_NAME + "/companies/byDescription?" + "description=" + description
								+ "&code=" + code + "&mainDescriptionOnly=" + mainDescriptionOnly + "&offset=" + offset,
						Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByKvkNumber(String KvkNumber) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/companies/byKvkNumber/" + KvkNumber, Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByTradeName(String tradename) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/companies/byTradeName/" + tradename, Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByPostalcode(String postalcode) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/companies/byPostalcode/" + postalcode, Company[].class);
		return Arrays.asList(companies);
	}

	public List<Company> getCompaniesByCity(String city) {

		RestTemplate restTemplate = new RestTemplate();
		Company[] companies = restTemplate.getForObject(Constants.KVK_API_BASE_NAME + "/companies/city/" + city,
				Company[].class);
		return Arrays.asList(companies);
	}

}
