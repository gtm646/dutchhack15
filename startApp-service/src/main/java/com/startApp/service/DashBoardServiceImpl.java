/**
 * 
 */
package com.startApp.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startApp.domain.Company;
import com.startApp.dto.CategoryDTO;
import com.startApp.dto.DashBoardDTO;
import com.startApp.dto.DashBoardbyCategoryDTO;
import com.startApp.repository.kvk.CompanyRepository;

/**
 * @author x085982
 *
 */
@Service
public class DashBoardServiceImpl implements DashBoardService {
	@Autowired
	private CompanyRepository companyRepository;

	public DashBoardDTO getDashBoardDetailsForSbiCodes() {
		DashBoardDTO dashBoardDTO = new DashBoardDTO();
		List<CategoryDTO> categoryDTOs = new ArrayList<>();

		for (String[] sbiCode : getsbiCodesFromCSVFile()) {
			List<Company> companiesWithSbiCode = companyRepository.getCompaniesByDescription("", sbiCode[1], "", "");
			CategoryDTO categoryDTO = new CategoryDTO();
			categoryDTO.setCategoryId(sbiCode[1]);
			categoryDTO.setCategoryName(sbiCode[0]);
			categoryDTO.setCount(companiesWithSbiCode.size());
			categoryDTOs.add(categoryDTO);
		}
		dashBoardDTO.setChildren(categoryDTOs);

		return dashBoardDTO;
	}

	public DashBoardbyCategoryDTO getDashBoardDetailsByCategory(String categoryId) {

		List<Company> companiesWithSbiCode = companyRepository.getCompaniesByDescription("", categoryId, "", "");
		DashBoardbyCategoryDTO dashBoardCategoryDTO = new DashBoardbyCategoryDTO();
		dashBoardCategoryDTO.setCompanies(companiesWithSbiCode);
		dashBoardCategoryDTO.setCategoryName(companiesWithSbiCode.get(0).getMainActivitysbiCodeDescription());
		dashBoardCategoryDTO.setCategoryId(companiesWithSbiCode.get(0).getMainActivitySbiCode());
		return dashBoardCategoryDTO;
	}

	public List<String[]> getsbiCodesFromCSVFile() {

		// String csvFile = "/SBi_code_DOH.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List<String[]> companySBIDetails = new ArrayList<>();

		try {

			br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/SBi_code_DOH.csv")));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] sbiDetails = line.split(cvsSplitBy);

				System.out.println("Company SBI [code= " + sbiDetails[0] + " , name=" + sbiDetails[1] + "]");
				companySBIDetails.add(sbiDetails);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return companySBIDetails;
	}
}
