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

	public BusinessAdviceDTO businessAdviceDTO(int currOpenCount, int currRunningCount, int currClosedCount) {
		BusinessAdviceDTO businessAdviceDTO = new BusinessAdviceDTO();
		businessAdviceDTO.setBusinessStabilityFactor((currRunningCount - 2 * currClosedCount) * 10);
		businessAdviceDTO.setCapitalFactor(calculateCapitalFactor());
		businessAdviceDTO.setWorkForceFactor(calculateWorkForceFactor());
		return businessAdviceDTO;

	}

	private int calculateCapitalFactor() {
		List<FinancialData> financialDatas = financialDataRepository.getAllFinancialData();
		List<Integer> assetAmount = new ArrayList<>();
		for (FinancialData financialData : financialDatas) {
			assetAmount.add(financialData.getTotaleActiva());
		}
		return Collections.min(assetAmount);

	}

	private int calculateWorkForceFactor() {
		return usgJobsRepository.getAllAvailableJobs("Engineering").getResults().size();

	}
}
