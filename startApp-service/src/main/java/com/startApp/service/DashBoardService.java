/**
 * 
 */
package com.startApp.service;

import java.util.List;

import com.startApp.dto.DashBoardDTO;
import com.startApp.dto.DashBoardbyCategoryDTO;
/**
 * @author x085982
 *
 */
public interface DashBoardService {
	public List<DashBoardDTO> getDashBoardDetailsForSbiCodes();
	public DashBoardbyCategoryDTO getDashBoardDetailsByCategory(String categoryId);
}
