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

import org.apache.commons.lang3.StringUtils;
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

		List<Company> companiesForGpsAndSibiCode = new ArrayList<>();
		List<Company> companiesWithGps = companyRepository.getCompaniesByGps(gpsLatitude, gpsLongitude, "", "");
		for (Company company : companiesWithGps) {
			if (StringUtils.equalsIgnoreCase(company.getMainActivitySbiCode(), categoryId)) {
				companiesForGpsAndSibiCode.add(company);
			}
		}
		System.out.println("Found matching entries: " + companiesForGpsAndSibiCode.size());
		categoryTrendsDTO.setCategoryId(categoryId);
		categoryTrendsDTO.setCategoryName(companiesForGpsAndSibiCode.get(0).getMainActivitysbiCodeDescription());

		return getCountOfCompaniesStartedThisYear(companiesForGpsAndSibiCode, categoryTrendsDTO);

	}

	public CategoryTrendsDTO getCountOfCompaniesStartedThisYear(List<Company> companiesForGpsAndSibiCode,
			CategoryTrendsDTO categoryTrendsDTO) {
		int totalCountOfCompaniesStarted = 0;
		int totalCountOfCompaniesClosed = 0;
		int totalCountOfCompaniesRunning = 0;
		for (Company company : companiesForGpsAndSibiCode) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date companyRegDate = null;
			Date companyClosedDate = null;
			try {
				if (company.getRegistrationDate() != null) {
					companyRegDate = sdf.parse(company.getRegistrationDate());
					Calendar cal = Calendar.getInstance();
					cal.setTime(companyRegDate);
					if (2010 <= cal.get(Calendar.YEAR) && cal.get(Calendar.YEAR) >= 2015) {
						totalCountOfCompaniesStarted++;
					}
					if (company.getDeregistrationDate() != null || company.getDeregistrationDate() != "") {
						totalCountOfCompaniesRunning++;
					}
				}

				if (company.getDeregistrationDate() != null) {
					companyClosedDate = sdf.parse(company.getDeregistrationDate());
					Calendar cal1 = Calendar.getInstance();
					cal1.setTime(companyClosedDate);
					if (2010 <= cal1.get(Calendar.YEAR) && cal1.get(Calendar.YEAR) >= 2015) {
						totalCountOfCompaniesClosed++;
					}
				}

			} catch (ParseException e) {
				System.err.println("date parser failed...." + companyRegDate);
			}

		}
		categoryTrendsDTO.setCountOfCompaniesStarted(totalCountOfCompaniesStarted);
		categoryTrendsDTO.setCountOfcompaniesClosedRecently(totalCountOfCompaniesClosed);
		categoryTrendsDTO.setCountOfcompaniesRunning(totalCountOfCompaniesRunning);
		return categoryTrendsDTO;

	}
}
