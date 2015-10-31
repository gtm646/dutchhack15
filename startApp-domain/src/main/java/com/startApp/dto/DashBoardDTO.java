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
public class DashBoardDTO {
	private String categoryId;
	private String categoryName;
	private int Count;
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
	
}
