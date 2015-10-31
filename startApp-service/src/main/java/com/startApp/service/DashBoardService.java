/**
 * 
 */
package com.startApp.service;

import com.startApp.dto.DashBoardDTO;
import com.startApp.dto.DashBoardbyCategoryDTO;
/**
 * @author x085982
 *
 */
public interface DashBoardService {
	public DashBoardDTO getDashBoardDetailsForSbiCodes();
	public DashBoardbyCategoryDTO getDashBoardDetailsByCategory(String categoryId);
}
