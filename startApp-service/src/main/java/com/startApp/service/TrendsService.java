/**
 * 
 */
package com.startApp.service;

import com.startApp.dto.CategoryTrendsDTO;

/**
 * @author x085982
 *
 */
public interface TrendsService {
	public CategoryTrendsDTO getCategoryTrends(String gpsLatitude, String gpsLongitude, String categoryId);
}
