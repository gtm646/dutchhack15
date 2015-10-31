/**
 * 
 */
package com.startApp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startApp.domain.Company;
import com.startApp.dto.CategoryTrendsDTO;
import com.startApp.repository.kvk.CompanyRepository;

/**
 * @author x085982
 *
 */
@Service
public class TrendsServiceImpl implements TrendsService {
	@Autowired
	private CompanyRepository companyRepository;

	public CategoryTrendsDTO getCategoryTrends(String gpsLatitude, String gpsLongitude, String categoryId) {
		CategoryTrendsDTO categoryTrendsDTO = new CategoryTrendsDTO();
		//List<Company> companiesWithSbiCode = companyRepository.getCompaniesByDescription("", categoryId, "", "");
		List<Company> companiesForGpsAndSibiCode = new ArrayList<>();
		List<Company> companiesWithGps = companyRepository.getCompaniesByGps(gpsLatitude, gpsLongitude, "", "");
		for (Company company : companiesWithGps) {
			 if(company.getMainActivitySbiCode()==categoryId){
				 companiesForGpsAndSibiCode.add(company);
			 }
		}
		System.out.println(companiesForGpsAndSibiCode.size());
		return categoryTrendsDTO;

	}

	public int getCountOfCompaniesStartedThisYear(List<Company> companiesForGpsAndSibiCode) {
		for (Company company : companiesForGpsAndSibiCode) {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			Calendar cal = Calendar.getInstance();
			System.out.println(sdf.format(cal.getTime()));
			Date currentDate = null;
			Date companyDate = null;

			try {
				currentDate = sdf.parse(sdf.format(cal.getTime()));
				companyDate = sdf.parse(company.getRegistrationDate());
			} catch (ParseException e) {
				System.err.println("date parser failed...." + currentDate + "and" + companyDate);
			}

			System.out.println(currentDate);
			System.out.println(companyDate);

			if (companyDate.compareTo(currentDate) > 0) {
				System.out.println("companyDate is after currentDate");
			}
		}

		return 0;

	}
}
