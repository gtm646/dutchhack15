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
	private String categoryId;
	private String categoryName;
	private int CountOfCompaniesStartedThisYear;
	private int CountOfcompaniesClosedRecently;
	private int CountOfcompaniesRunning;

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @return the countOfCompaniesStartedThisYear
	 */
	public int getCountOfCompaniesStartedThisYear() {
		return CountOfCompaniesStartedThisYear;
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
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @param categoryName
	 *            the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @param countOfCompaniesStartedThisYear
	 *            the countOfCompaniesStartedThisYear to set
	 */
	public void setCountOfCompaniesStartedThisYear(int countOfCompaniesStartedThisYear) {
		CountOfCompaniesStartedThisYear = countOfCompaniesStartedThisYear;
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
