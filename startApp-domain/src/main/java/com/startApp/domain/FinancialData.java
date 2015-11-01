/**
 * 
 */
package com.startApp.domain;

/**
 * @author x085982
 *
 */
public class FinancialData {
	private String kvknummer; 
	private Integer vasteActiva;
	private Integer vlottendeActiva;
	private Integer totaleActiva;
	private Integer eigenVermogen;
	private Integer overigePassiva;
	private Integer totalPassiva;
	/**
	 * @return the kvknummer
	 */
	public String getKvknummer() {
		return kvknummer;
	}
	/**
	 * @return the vasteActiva
	 */
	public Integer getVasteActiva() {
		return vasteActiva;
	}
	/**
	 * @return the currentAssets
	 */
	public Integer getCurrentAssets() {
		return vlottendeActiva;
	}
	/**
	 * @return the totaleActiva
	 */
	public Integer getTotaleActiva() {
		return totaleActiva;
	}
	/**
	 * @return the eigenVermogen
	 */
	public Integer getEigenVermogen() {
		return eigenVermogen;
	}
	/**
	 * @return the otherLiabilitie
	 */
	public Integer getOtherLiabilitie() {
		return overigePassiva;
	}
	/**
	 * @return the totalPassiva
	 */
	public Integer getTotalPassiva() {
		return totalPassiva;
	}
	/**
	 * @param kvknummer the kvknummer to set
	 */
	public void setKvknummer(String kvknummer) {
		this.kvknummer = kvknummer;
	}
	/**
	 * @param vasteActiva the vasteActiva to set
	 */
	public void setVasteActiva(Integer vasteActiva) {
		this.vasteActiva = vasteActiva;
	}
	/**
	 * @param currentAssets the currentAssets to set
	 */
	public void setCurrentAssets(Integer currentAssets) {
		this.vlottendeActiva = currentAssets;
	}
	/**
	 * @param totaleActiva the totaleActiva to set
	 */
	public void setTotaleActiva(Integer totaleActiva) {
		this.totaleActiva = totaleActiva;
	}
	/**
	 * @param eigenVermogen the eigenVermogen to set
	 */
	public void setEigenVermogen(Integer eigenVermogen) {
		this.eigenVermogen = eigenVermogen;
	}
	/**
	 * @param otherLiabilitie the otherLiabilitie to set
	 */
	public void setOtherLiabilitie(Integer overigePassiva) {
		this.overigePassiva = overigePassiva;
	}
	/**
	 * @param totalPassiva the totalPassiva to set
	 */
	public void setTotalPassiva(Integer totalPassiva) {
		this.totalPassiva = totalPassiva;
	}
}
