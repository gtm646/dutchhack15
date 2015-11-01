/**
 * 
 */
package com.startApp.repository.kvk;

import java.util.List;

import com.startApp.domain.Company;
import com.startApp.domain.FinancialData;

/**
 * @author x085982
 *
 */
public interface FinancialDataRepository {
	public List<FinancialData> getAllFinancialData();

}
