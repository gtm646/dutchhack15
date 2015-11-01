/**
 * 
 */
package com.startApp.service;

import com.startApp.domain.Company;
import com.startApp.domain.usg.Example;
import com.startApp.dto.BusinessAdviceDTO;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author x085982
 *
 */
public interface BusinessAdviceService {
	public Example getAllAvailableJobs(String job);
	public BusinessAdviceDTO businessAdviceDTO(int currOpenCount, int currRunningCount, int currClosedCount,int captitalInvestment);
}
