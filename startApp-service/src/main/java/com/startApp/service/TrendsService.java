/**
 * 
 */
package com.startApp.service;

import java.util.List;

import com.startApp.dto.CategoryTrendsDTO;

/**
 * @author x085982
 *
 */
public interface TrendsService {
	public List<CategoryTrendsDTO> getCategoryTrends(String gpsLatitude, String gpsLongitude, String categoryId);
}
