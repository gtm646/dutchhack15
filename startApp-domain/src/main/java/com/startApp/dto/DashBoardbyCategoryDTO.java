/**
 * 
 */
package com.startApp.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.startApp.domain.Company;

/**
 * @author x085982
 *
 */
@Component
public class DashBoardbyCategoryDTO {
	private String categoryId;
	private String categoryName;
	private int Count;
	private List<Company> companies;
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
	 * @return the count
	 */
	public int getCount() {
		return Count;
	}
	/**
	 * @return the companies
	 */
	public List<Company> getCompanies() {
		return companies;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		Count = count;
	}
	/**
	 * @param companies the companies to set
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	

}
