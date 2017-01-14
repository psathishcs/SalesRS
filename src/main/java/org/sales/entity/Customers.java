package org.sales.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customers implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CUST_ID")
	private Long custID;
	@Column(name = "CUST_FIRST_NAME")
	private String custFirstName;
	@Column(name = "CUST_LAST_NAME")
	private String custLastName;
	@Column(name = "CUST_GENDER")
	private char custGender;
	@Column(name = "CUST_YEAR_OF_BIRTH")
	private Integer custYearOfBirth;
	@Column(name = "CUST_MARITAL_STATUS", nullable=true)
	private String custMaritalStatus;
	@Column(name = "CUST_STREET_ADDRESS")
	private String custStreetAddress;
	@Column(name = "CUST_POSTAL_CODE")
	private String custPostalCode;
	@Column(name = "CUST_CITY")
	private String custCity;
	@Column(name = "CUST_CITY_ID")
	private Long custCityID;
	@Column(name = "CUST_STATE_PROVINCE")
	private String custStateProvince;
	@Column(name = "CUST_STATE_PROVINCE_ID")
	private Long custStateProvinceID;
	@Column(name = "COUNTRY_ID")
	private Integer countryID;
	@Column(name = "CUST_MAIN_PHONE_NUMBER")
	private String custMainPhoneNumber;
	@Column(name = "CUST_INCOME_LEVEL", nullable=true)
	private String custIncomeLevel;
	@Column(name = "CUST_CREDIT_LIMIT", nullable=true)
	private String custCreditLimit;
	@Column(name = "CUST_EMAIL", nullable=true)
	private String custEmail;
	@Column(name = "CUST_TOTAL")
	private String custTotal;
	@Column(name = "CUST_TOTAL_ID")
	private Long custTotalID;
	@Column(name = "CUST_SRC_ID", nullable=true)
	private Integer custSrcID;
	@Column(name = "CUST_EFF_FROM", nullable=true)
	private Date custEffFrom;
	@Column(name = "CUST_EFF_TO", nullable=true)
	private Date custEffTo;
	@Column(name = "CUST_VALID", nullable=true)
	private Character  custValid;
	public Long getCustID() {
		return custID;
	}
	public void setCustID(Long custID) {
		this.custID = custID;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public char getCustGender() {
		return custGender;
	}
	public void setCustGender(char custGender) {
		this.custGender = custGender;
	}
	public Integer getCustYearOfBirth() {
		return custYearOfBirth;
	}
	public void setCustYearOfBirth(Integer custYearOfBirth) {
		this.custYearOfBirth = custYearOfBirth;
	}
	public String getCustMaritalStatus() {
		return custMaritalStatus;
	}
	public void setCustMaritalStatus(String custMaritalStatus) {
		this.custMaritalStatus = custMaritalStatus;
	}
	public String getCustStreetAddress() {
		return custStreetAddress;
	}
	public void setCustStreetAddress(String custStreetAddress) {
		this.custStreetAddress = custStreetAddress;
	}
	public String getCustPostalCode() {
		return custPostalCode;
	}
	public void setCustPostalCode(String custPostalCode) {
		this.custPostalCode = custPostalCode;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public Long getCustCityID() {
		return custCityID;
	}
	public void setCustCityID(Long custCityID) {
		this.custCityID = custCityID;
	}
	public String getCustStateProvince() {
		return custStateProvince;
	}
	public void setCustStateProvince(String custStateProvince) {
		this.custStateProvince = custStateProvince;
	}
	public Long getCustStateProvinceID() {
		return custStateProvinceID;
	}
	public void setCustStateProvinceID(Long custStateProvinceID) {
		this.custStateProvinceID = custStateProvinceID;
	}
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	public String getCustMainPhoneNumber() {
		return custMainPhoneNumber;
	}
	public void setCustMainPhoneNumber(String custMainPhoneNumber) {
		this.custMainPhoneNumber = custMainPhoneNumber;
	}
	public String getCustIncomeLevel() {
		return custIncomeLevel;
	}
	public void setCustIncomeLevel(String custIncomeLevel) {
		this.custIncomeLevel = custIncomeLevel;
	}
	public String getCustCreditLimit() {
		return custCreditLimit;
	}
	public void setCustCreditLimit(String custCreditLimit) {
		this.custCreditLimit = custCreditLimit;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustTotal() {
		return custTotal;
	}
	public void setCustTotal(String custTotal) {
		this.custTotal = custTotal;
	}
	public Long getCustTotalID() {
		return custTotalID;
	}
	public void setCustTotalID(Long custTotalID) {
		this.custTotalID = custTotalID;
	}
	public Integer getCustSrcID() {
		return custSrcID;
	}
	public void setCustSrcID(Integer custSrcID) {
		this.custSrcID = custSrcID;
	}
	public Date getCustEffFrom() {
		return custEffFrom;
	}
	public void setCustEffFrom(Date custEffFrom) {
		this.custEffFrom = custEffFrom;
	}
	public Date getCustEffTo() {
		return custEffTo;
	}
	public void setCustEffTo(Date custEffTo) {
		this.custEffTo = custEffTo;
	}
	public Character  getCustValid() {
		return custValid;
	}
	public void setCustValid(Character  custValid) {
		this.custValid = custValid;
	}
}
