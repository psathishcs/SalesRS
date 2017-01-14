package org.sales.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRIES")
public class Countries implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COUNTRY_ID")
	private Integer countryID;
	@Column(name = "COUNTRY_ISO_CODE")
	private String countryISOCode;
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "COUNTRY_SUBREGION")
	private String countrySubRegion;
	@Column(name = "COUNTRY_SUBREGION_ID")
	private String countrySubRegionID;
	@Column(name = "COUNTRY_REGION")
	private String countryRegion;
	@Column(name = "COUNTRY_REGION_ID")
	private String countryRegionID;
	@Column(name = "COUNTRY_TOTAL")
	private String countryTotal;
	@Column(name = "COUNTRY_TOTAL_ID")
	private Long countryTotalID;
	@Column(name = "COUNTRY_NAME_HIST")
	private String countryNameHist;
	
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	public String getCountryISOCode() {
		return countryISOCode;
	}
	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountrySubRegion() {
		return countrySubRegion;
	}
	public void setCountrySubRegion(String countrySubRegion) {
		this.countrySubRegion = countrySubRegion;
	}
	public String getCountrySubRegionID() {
		return countrySubRegionID;
	}
	public void setCountrySubRegionID(String countrySubRegionID) {
		this.countrySubRegionID = countrySubRegionID;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getCountryRegionID() {
		return countryRegionID;
	}
	public void setCountryRegionID(String countryRegionID) {
		this.countryRegionID = countryRegionID;
	}
	public String getCountryTotal() {
		return countryTotal;
	}
	public void setCountryTotal(String countryTotal) {
		this.countryTotal = countryTotal;
	}
	public Long getCountryTotalID() {
		return countryTotalID;
	}
	public void setCountryTotalID(Long countryTotalID) {
		this.countryTotalID = countryTotalID;
	}
	public String getCountryNameHist() {
		return countryNameHist;
	}
	public void setCountryNameHist(String countryNameHist) {
		this.countryNameHist = countryNameHist;
	}
}
