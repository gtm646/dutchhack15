/**
 * 
 */
package com.startApp.repository.usgp;

import java.util.List;

import com.startApp.domain.Company;
import com.startApp.domain.usg.Example;

/**
 * @author x085982
 *
 */
public interface UsgJobsRepository {
	public Example getAllAvailableJobs(String query);
}
