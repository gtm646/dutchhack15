/**
 * 
 */
package com.startApp.dto;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author x085982
 *
 */
@Component
public class DashBoardDTO {
	private List<CategoryDTO> children;

	/**
	 * @return the categories
	 */
	public List<CategoryDTO> getChildren() {
		return children;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setChildren(List<CategoryDTO> children) {
		this.children = children;
	}

}
