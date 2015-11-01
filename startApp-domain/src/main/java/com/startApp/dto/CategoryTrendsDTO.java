/**
 * 
 */
package com.startApp.dto;

import org.springframework.stereotype.Component;

/**
 * @author x085982
 *
 */
@Component
public class CategoryTrendsDTO {
	private int year;
	private int CountOfCompaniesStarted;
	private int CountOfcompaniesClosedRecently;
	private int CountOfcompaniesRunning;

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the countOfCompaniesStartedThisYear
	 */
	public int getCountOfCompaniesStarted() {
		return CountOfCompaniesStarted;
	}

	/**
	 * @return the countOfcompaniesClosedRecently
	 */
	public int getCountOfcompaniesClosedRecently() {
		return CountOfcompaniesClosedRecently;
	}

	/**
	 * @return the countOfcompaniesRunning
	 */
	public int getCountOfcompaniesRunning() {
		return CountOfcompaniesRunning;
	}

	/**
	 * @param countOfCompaniesStartedThisYear
	 *            the countOfCompaniesStartedThisYear to set
	 */
	public void setCountOfCompaniesStarted(int countOfCompaniesStartedThisYear) {
		CountOfCompaniesStarted = countOfCompaniesStartedThisYear;
	}

	/**
	 * @param countOfcompaniesClosedRecently
	 *            the countOfcompaniesClosedRecently to set
	 */
	public void setCountOfcompaniesClosedRecently(int countOfcompaniesClosedRecently) {
		CountOfcompaniesClosedRecently = countOfcompaniesClosedRecently;
	}

	/**
	 * @param countOfcompaniesRunning
	 *            the countOfcompaniesRunning to set
	 */
	public void setCountOfcompaniesRunning(int countOfcompaniesRunning) {
		CountOfcompaniesRunning = countOfcompaniesRunning;
	}

}
