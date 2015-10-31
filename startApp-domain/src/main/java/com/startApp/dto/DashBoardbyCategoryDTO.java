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
	private String category;
	private int Count;
	private List<Company> companies;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public List<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

}
