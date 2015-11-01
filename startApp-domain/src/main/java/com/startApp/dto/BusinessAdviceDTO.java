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
public class BusinessAdviceDTO {
	private int businessStabilityFactor;
	private int workForceFactor;
	private int capitalFactor;

	/**
	 * @return the businessStabilityFactor
	 */
	public int getBusinessStabilityFactor() {
		return businessStabilityFactor;
	}

	/**
	 * @return the workForceFactor
	 */
	public int getWorkForceFactor() {
		return workForceFactor;
	}

	/**
	 * @return the capitalFactor
	 */
	public int getCapitalFactor() {
		return capitalFactor;
	}

	/**
	 * @param businessStabilityFactor
	 *            the businessStabilityFactor to set
	 */
	public void setBusinessStabilityFactor(int businessStabilityFactor) {
		this.businessStabilityFactor = businessStabilityFactor;
	}

	/**
	 * @param workForceFactor
	 *            the workForceFactor to set
	 */
	public void setWorkForceFactor(int workForceFactor) {
		this.workForceFactor = workForceFactor;
	}

	/**
	 * @param capitalFactor
	 *            the capitalFactor to set
	 */
	public void setCapitalFactor(int capitalFactor) {
		this.capitalFactor = capitalFactor;
	}

}
