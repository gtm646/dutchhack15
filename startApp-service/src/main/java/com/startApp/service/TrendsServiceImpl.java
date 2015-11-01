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

	public List<CategoryTrendsDTO> getCategoryTrends(String gpsLatitude, String gpsLongitude, String categoryId) {
		CategoryTrendsDTO categoryTrendsDTO = new CategoryTrendsDTO();

		List<Company> companiesForGpsAndSibiCode = new ArrayList<>();
		List<Company> companiesWithGps = companyRepository.getCompaniesByGps(gpsLatitude, gpsLongitude, "", "");
		for (Company company : companiesWithGps) {
			if (StringUtils.equalsIgnoreCase(company.getMainActivitySbiCode(), categoryId)) {
				companiesForGpsAndSibiCode.add(company);
			}
		}
		System.out.println("Found matching entries: " + companiesForGpsAndSibiCode.size());

		return getCountOfCompanies(companiesForGpsAndSibiCode, categoryTrendsDTO);

	}

	private List<CategoryTrendsDTO> getCountOfCompanies(List<Company> companiesForGpsAndSibiCode,
			CategoryTrendsDTO categoryTrendsDTO) {

		List<CategoryTrendsDTO> categoryTrendsDTOs = new ArrayList<>();
		CategoryTrendsDTO categoryTrendsDTO2015 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2015, companiesForGpsAndSibiCode, 2015));

		CategoryTrendsDTO categoryTrendsDTO2014 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2014, companiesForGpsAndSibiCode, 2014));

		CategoryTrendsDTO categoryTrendsDTO2013 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2013, companiesForGpsAndSibiCode, 2013));

		CategoryTrendsDTO categoryTrendsDTO2012 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2012, companiesForGpsAndSibiCode, 2012));

		CategoryTrendsDTO categoryTrendsDTO2011 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2011, companiesForGpsAndSibiCode, 2011));

		CategoryTrendsDTO categoryTrendsDTO2010 = new CategoryTrendsDTO();
		categoryTrendsDTOs.add(getcategoryTrendsDTO(categoryTrendsDTO2010, companiesForGpsAndSibiCode, 2010));
		return categoryTrendsDTOs;
	}

	private CategoryTrendsDTO getcategoryTrendsDTO(CategoryTrendsDTO categoryTrendsDTO2015,
			List<Company> companiesForGpsAndSibiCode, int year) {
		int totalCountOfCompaniesStarted = 0;
		int totalCountOfCompaniesClosed = 0;
		int totalCountOfCompaniesRunning = 0;

		for (Company company : companiesForGpsAndSibiCode) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date companyRegDate = null;
			Date companyClosedDate = null;
			if (company.getRegistrationDate() != null) {
				try {
					companyRegDate = sdf.parse(company.getRegistrationDate());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Calendar cal = Calendar.getInstance();
				cal.setTime(companyRegDate);
				if (cal.get(Calendar.YEAR) == year) {
					totalCountOfCompaniesStarted++;
				}
			}

			if ((company.getDeregistrationDate() != null && company.getDeregistrationDate() != "")) {
				try {
					companyClosedDate = sdf.parse(company.getDeregistrationDate());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(companyClosedDate);
				if (year == cal1.get(Calendar.YEAR)) {
					totalCountOfCompaniesClosed++;
				}
				if (year != cal1.get(Calendar.YEAR)) {
					totalCountOfCompaniesRunning++;
				}
			}
		}
		categoryTrendsDTO2015.setCountOfcompaniesClosedRecently(totalCountOfCompaniesClosed);
		categoryTrendsDTO2015.setCountOfcompaniesRunning(totalCountOfCompaniesRunning);
		categoryTrendsDTO2015.setCountOfCompaniesStarted(totalCountOfCompaniesStarted);
		categoryTrendsDTO2015.setYear(year);
		return categoryTrendsDTO2015;
	}
}
