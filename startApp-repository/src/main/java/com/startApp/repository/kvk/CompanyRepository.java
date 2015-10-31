/**
 * 
 */
package com.startApp.repository.kvk;

import java.util.List;

import com.startApp.domain.Company;

/**
 * @author x085982
 *
 */
public interface CompanyRepository {
	public List<Company> getAllSampleCompanies();

	public List<Company> getCompaniesByGps(String gpsLatitude, String gpsLongitude, String radius, String offset);

	public List<Company> getCompaniesByDescription(String description, String code, String mainDescriptionOnly,
			String offset);

	public List<Company> getCompaniesByKvkNumber(String KvkNumber);

	public List<Company> getCompaniesByTradeName(String tradename);

	public List<Company> getCompaniesByPostalcode(String postalcode);

	public List<Company> getCompaniesByCity(String city);

}
