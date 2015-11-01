/**
 * 
 */
package com.startApp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startApp.domain.FinancialData;
import com.startApp.domain.usg.Example;
import com.startApp.dto.BusinessAdviceDTO;
import com.startApp.repository.kvk.FinancialDataRepository;
import com.startApp.repository.usgp.UsgJobsRepository;
import com.startApp.utils.Constants;

/**
 * @author x085982
 *
 */
@Service
public class BusinessAdviceServiceImpl implements BusinessAdviceService {
	@Autowired
	private UsgJobsRepository usgJobsRepository;

	@Autowired
	private FinancialDataRepository financialDataRepository;

	public Example getAllAvailableJobs(String job) {
		return usgJobsRepository.getAllAvailableJobs(job);
	}

	public BusinessAdviceDTO businessAdviceDTO(int currOpenCount, int currRunningCount, int currClosedCount,
			int captitalInvestment) {
		BusinessAdviceDTO businessAdviceDTO = new BusinessAdviceDTO();
		businessAdviceDTO.setBusinessStabilityFactor((currRunningCount - 2 * currClosedCount) * 10);
		businessAdviceDTO.setCapitalFactor(calculateCapitalFactor(captitalInvestment));
		businessAdviceDTO.setWorkForceFactor((calculateWorkForceFactor()/2)*10);
		return businessAdviceDTO;

	}

	private Integer calculateCapitalFactor(int captitalInvestment) {
		List<FinancialData> financialDatas = financialDataRepository.getAllFinancialData();
		List<Integer> assetAmount = new ArrayList<>();
		for (FinancialData financialData : financialDatas) {
			assetAmount.add(financialData.getTotaleActiva());
		}
		int factor = 0;
		if (captitalInvestment >= Collections.min(assetAmount)) {
			factor = 1;
		}
		if (captitalInvestment < Collections.min(assetAmount)) {
			factor = 0;
		}
		return factor;

	}

	private int calculateWorkForceFactor() {
		return usgJobsRepository.getAllAvailableJobs(Constants.category).getResults().size();

	}
}
