/**
 * 
 */
package com.startApp.domain;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.stereotype.Component;

/**
 * @author x085982
 *
 */
@Component
public class Company {
	private Integer id;
	/**
	 * identifying number for the Dutch Chamber of Commerce
	 */
	private String kvknummer;
	/**
	 * identifying number for an establishment/branch
	 */
	private String vestigingsnummer;

	private String tradeNames;
	/**
	 * The statutory names of this company ( (name of a legal entity if the
	 * legal entity has articles of association), If multiple are present, these
	 * are seperated by a
	 */
	private String statutoryNames;
	private String legalFormCode;
	private String legalFormDescription;
	private String hasEntryInCommercialRegister;
	/**
	 * 1 if this record is a legalPerson, 0 otherwise
	 */
	private String isLegalPerson;
	/**
	 * 1 if this record is an establishment, 0 otherwise
	 */
	private String isEstablishment;
	/**
	 * 1 if this record is an establishment, 0 otherwise
	 */
	private String isMainEstablishment;
	private String employees;
	private String registrationDate;
	private String deregistrationDate;
	private String street;
	private String houseNumber;
	private String houseNumberAddition;
	private String postalCode;
	private String city;
	private String gpsLatitude;
	private String gpsLongitude;
	private String website;
	/**
	 * SBI code for the main activity
	 */
	private String mainActivitySbiCode;
	/**
	 * SBI description of the main activity
	 */
	private String mainActivitysbiCodeDescription;

	/**
	 * SBI code for the first sub-activity
	 */
	private String activity1SbiCode;
	/**
	 * BI description of the first sub-activity
	 */
	private String activity1SbiCodeDescription;
	/**
	 * SBI code for the second sub-activity
	 */
	private String activity2SbiCode;
	/**
	 * SBI description of the second sub-activity
	 */
	private String activity2SbiCodeDescription;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the kvknummer
	 */
	public String getKvknummer() {
		return kvknummer;
	}

	/**
	 * @param kvknummer
	 *            the kvknummer to set
	 */
	public void setKvknummer(String kvknummer) {
		this.kvknummer = kvknummer;
	}

	/**
	 * @return the vestigingsnummer
	 */
	public String getVestigingsnummer() {
		return vestigingsnummer;
	}

	/**
	 * @param vestigingsnummer
	 *            the vestigingsnummer to set
	 */
	public void setVestigingsnummer(String vestigingsnummer) {
		this.vestigingsnummer = vestigingsnummer;
	}

	/**
	 * @return the tradeNames
	 */
	public String getTradeNames() {
		return tradeNames;
	}

	/**
	 * @param tradeNames
	 *            the tradeNames to set
	 */
	public void setTradeNames(String tradeNames) {
		this.tradeNames = tradeNames;
	}

	/**
	 * @return the statutoryNames
	 */
	public String getStatutoryNames() {
		return statutoryNames;
	}

	/**
	 * @param statutoryNames
	 *            the statutoryNames to set
	 */
	public void setStatutoryNames(String statutoryNames) {
		this.statutoryNames = statutoryNames;
	}

	/**
	 * @return the legalFormCode
	 */
	public String getLegalFormCode() {
		return legalFormCode;
	}

	/**
	 * @param legalFormCode
	 *            the legalFormCode to set
	 */
	public void setLegalFormCode(String legalFormCode) {
		this.legalFormCode = legalFormCode;
	}

	/**
	 * @return the legalFormDescription
	 */
	public String getLegalFormDescription() {
		return legalFormDescription;
	}

	/**
	 * @param legalFormDescription
	 *            the legalFormDescription to set
	 */
	public void setLegalFormDescription(String legalFormDescription) {
		this.legalFormDescription = legalFormDescription;
	}

	/**
	 * @return the hasEntryInCommercialRegister
	 */
	public String getHasEntryInCommercialRegister() {
		return hasEntryInCommercialRegister;
	}

	/**
	 * @param hasEntryInCommercialRegister
	 *            the hasEntryInCommercialRegister to set
	 */
	public void setHasEntryInCommercialRegister(String hasEntryInCommercialRegister) {
		this.hasEntryInCommercialRegister = hasEntryInCommercialRegister;
	}

	/**
	 * @return the isLegalPerson
	 */
	public String getIsLegalPerson() {
		return isLegalPerson;
	}

	/**
	 * @param isLegalPerson
	 *            the isLegalPerson to set
	 */
	public void setIsLegalPerson(String isLegalPerson) {
		this.isLegalPerson = isLegalPerson;
	}

	/**
	 * @return the isEstablishment
	 */
	public String getIsEstablishment() {
		return isEstablishment;
	}

	/**
	 * @param isEstablishment
	 *            the isEstablishment to set
	 */
	public void setIsEstablishment(String isEstablishment) {
		this.isEstablishment = isEstablishment;
	}

	/**
	 * @return the isMainEstablishment
	 */
	public String getIsMainEstablishment() {
		return isMainEstablishment;
	}

	/**
	 * @param isMainEstablishment
	 *            the isMainEstablishment to set
	 */
	public void setIsMainEstablishment(String isMainEstablishment) {
		this.isMainEstablishment = isMainEstablishment;
	}

	/**
	 * @return the employees
	 */
	public String getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(String employees) {
		this.employees = employees;
	}

	/**
	 * @return the registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate
	 *            the registrationDate to set
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the deregistrationDate
	 */
	public String getDeregistrationDate() {
		return deregistrationDate;
	}

	/**
	 * @param deregistrationDate
	 *            the deregistrationDate to set
	 */
	public void setDeregistrationDate(String deregistrationDate) {
		this.deregistrationDate = deregistrationDate;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @param houseNumber
	 *            the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * @return the houseNumberAddition
	 */
	public String getHouseNumberAddition() {
		return houseNumberAddition;
	}

	/**
	 * @param houseNumberAddition
	 *            the houseNumberAddition to set
	 */
	public void setHouseNumberAddition(String houseNumberAddition) {
		this.houseNumberAddition = houseNumberAddition;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the gpsLatitude
	 */
	public String getGpsLatitude() {
		return gpsLatitude;
	}

	/**
	 * @param gpsLatitude
	 *            the gpsLatitude to set
	 */
	public void setGpsLatitude(String gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	/**
	 * @return the gpsLongitude
	 */
	public String getGpsLongitude() {
		return gpsLongitude;
	}

	/**
	 * @param gpsLongitude
	 *            the gpsLongitude to set
	 */
	public void setGpsLongitude(String gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the mainActivitySbiCode
	 */
	public String getMainActivitySbiCode() {
		return mainActivitySbiCode;
	}

	/**
	 * @param mainActivitySbiCode
	 *            the mainActivitySbiCode to set
	 */
	public void setMainActivitySbiCode(String mainActivitySbiCode) {
		this.mainActivitySbiCode = mainActivitySbiCode;
	}

	/**
	 * @return the mainActivitysbiCodeDescription
	 */
	public String getMainActivitysbiCodeDescription() {
		return mainActivitysbiCodeDescription;
	}

	/**
	 * @param mainActivitysbiCodeDescription
	 *            the mainActivitysbiCodeDescription to set
	 */
	public void setMainActivitysbiCodeDescription(String mainActivitysbiCodeDescription) {
		this.mainActivitysbiCodeDescription = mainActivitysbiCodeDescription;
	}

	/**
	 * @return the activity1SbiCode
	 */
	public String getActivity1SbiCode() {
		return activity1SbiCode;
	}

	/**
	 * @param activity1SbiCode
	 *            the activity1SbiCode to set
	 */
	public void setActivity1SbiCode(String activity1SbiCode) {
		this.activity1SbiCode = activity1SbiCode;
	}

	/**
	 * @return the activity1SbiCodeDescription
	 */
	public String getActivity1SbiCodeDescription() {
		return activity1SbiCodeDescription;
	}

	/**
	 * @param activity1SbiCodeDescription
	 *            the activity1SbiCodeDescription to set
	 */
	public void setActivity1SbiCodeDescription(String activity1SbiCodeDescription) {
		this.activity1SbiCodeDescription = activity1SbiCodeDescription;
	}

	/**
	 * @return the activity2SbiCode
	 */
	public String getActivity2SbiCode() {
		return activity2SbiCode;
	}

	/**
	 * @param activity2SbiCode
	 *            the activity2SbiCode to set
	 */
	public void setActivity2SbiCode(String activity2SbiCode) {
		this.activity2SbiCode = activity2SbiCode;
	}

	/**
	 * @return the activity2SbiCodeDescription
	 */
	public String getActivity2SbiCodeDescription() {
		return activity2SbiCodeDescription;
	}

	/**
	 * @param activity2SbiCodeDescription
	 *            the activity2SbiCodeDescription to set
	 */
	public void setActivity2SbiCodeDescription(String activity2SbiCodeDescription) {
		this.activity2SbiCodeDescription = activity2SbiCodeDescription;
	}
}
