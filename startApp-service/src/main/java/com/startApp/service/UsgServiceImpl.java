/**
 * 
 */
package com.startApp.service;

import com.startApp.domain.usg.Example;
import com.startApp.repository.usgp.UsgJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author x085982
 *
 */
@Service
public class UsgServiceImpl implements UsgService {
	@Autowired
	private UsgJobsRepository usgJobsRepository;

	public Example getAllAvailableJobs() {
		return usgJobsRepository.getAllAvailableJobs("a");
	}
}
