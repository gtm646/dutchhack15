/**
 * 
 */
package com.startApp.repository.kvk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.startApp.domain.FinancialData;
import com.startApp.utils.Constants;

/**
 * @author x085982
 *
 */
@Repository
public class FinanancialDataRepositoryImpl implements FinancialDataRepository {

	public List<FinancialData> getAllFinancialData() {

		RestTemplate restTemplate = new RestTemplate();
		FinancialData financialDataOfcompany1 = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/financialdata/bykvknummer/14076624?token=88witnhykqr4ichlzwdf", FinancialData.class);
		FinancialData financialDataOfcompany2 = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/financialdata/bykvknummer/14631754?token=88witnhykqr4ichlzwdf", FinancialData.class);
		FinancialData financialDataOfcompany3 = restTemplate
				.getForObject(Constants.KVK_API_BASE_NAME + "/financialdata/bykvknummer/14619071?token=88witnhykqr4ichlzwdf", FinancialData.class);

		List<FinancialData> financialDataOfcompanies = new ArrayList<>();
		financialDataOfcompanies.add(financialDataOfcompany1);
		financialDataOfcompanies.add(financialDataOfcompany2);
		financialDataOfcompanies.add(financialDataOfcompany3);
		return financialDataOfcompanies;
	}
}
