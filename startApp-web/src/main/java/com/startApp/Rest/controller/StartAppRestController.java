package com.startApp.Rest.controller;

import java.util.List;

import com.startApp.service.UsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.startApp.domain.Company;
import com.startApp.dto.DashBoardDTO;
import com.startApp.dto.DashBoardbyCategoryDTO;
import com.startApp.service.CompanyService;
import com.startApp.domain.usg.Example;
import com.startApp.service.DashBoardService;

@RestController
public class StartAppRestController {
	@Autowired
	private CompanyService CompanyService;
	@Autowired
	private DashBoardService dashBoardService;

    @Autowired
    private UsgService usgService;

	@RequestMapping(value = "retrieveAllSampleCompanyData", method = RequestMethod.GET)
	public List<Company> getAllSampleCompanyDetails() {
		return CompanyService.getAllSampleCompanies();
	}

	@RequestMapping(value = "retrieveDashBoardData", method = RequestMethod.GET)
	public List<DashBoardDTO> getDashBoardDetails() {
		return dashBoardService.getDashBoardDetailsForSbiCodes();
	}
	
	@RequestMapping(value = "retrieveDashBoardDataByCategory/{categoryId}", method = RequestMethod.GET)
	public DashBoardbyCategoryDTO getDashBoardDetailsByCategory(@PathVariable("categoryId") String categoryId) {
		return dashBoardService.getDashBoardDetailsByCategory(categoryId);
	}

    @RequestMapping(value = "retrieveAllJobs", method = RequestMethod.GET)
    public Example retrieveAllJobs() {
        return usgService.getAllAvailableJobs();
    }
}
