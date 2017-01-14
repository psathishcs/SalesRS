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
@Table(name="PRODUCTS")
public class Products implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PROD_ID")
	private Long prodID;
	@Column(name = "PROD_NAME")
	private String prodName;
	@Column(name = "PROD_DESC")
	private String prodDesc;
	@Column(name = "PROD_SUBCATEGORY")
	private String prodSubCategory;
	@Column(name = "PROD_SUBCATEGORY_ID")
	private Integer prodSubCategoryID;
	@Column(name = "PROD_SUBCATEGORY_DESC")
	private String prodSubCategoryDesc;
	@Column(name = "PROD_CATEGORY")
	private String prodCategory;
	@Column(name = "PROD_CATEGORY_ID")
	private Integer prodCategoryID;
	@Column(name = "PROD_CATEGORY_DESC")
	private String prodCategoryDesc;
	@Column(name = "PROD_WEIGHT_CLASS")
	private Integer prodWeightClass;
	@Column(name = "PROD_UNIT_OF_MEASURE")
	private String prodUnitOfMeasure;
	@Column(name = "PROD_PACK_SIZE")
	private String prodPackSize;
	@Column(name = "SUPPLIER_ID")
	private Long supplierID;
	@Column(name = "PROD_STATUS")
	private String prodStatus;
	@Column(name = "PROD_LIST_PRICE")
	private Double prodListPrice;
	@Column(name = "PROD_MIN_PRICE")
	private Double prodMinPrice;
	@Column(name = "PROD_TOTAL")
	private String prodTotal;
	@Column(name = "PROD_TOTAL_ID")
	private Integer prodTotalID;
	@Column(name = "PROD_SRC_ID")
	private Integer prodSrcID;
	@Column(name = "PROD_EFF_FROM")
	private Date prodEffFrom;
	@Column(name = "PROD_EFF_TO")
	private Date prodEffTo;
	@Column(name = "PROD_VALID")
	private char prodValid;
	
	public Long getProdID() {
		return prodID;
	}
	public void setProdID(Long prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProdSubCategory() {
		return prodSubCategory;
	}
	public void setProdSubCategory(String prodSubCategory) {
		this.prodSubCategory = prodSubCategory;
	}
	public Integer getProdSubCategoryID() {
		return prodSubCategoryID;
	}
	public void setProdSubCategoryID(Integer prodSubCategoryID) {
		this.prodSubCategoryID = prodSubCategoryID;
	}
	public String getProdSubCategoryDesc() {
		return prodSubCategoryDesc;
	}
	public void setProdSubCategoryDesc(String prodSubCategoryDesc) {
		this.prodSubCategoryDesc = prodSubCategoryDesc;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public Integer getProdCategoryID() {
		return prodCategoryID;
	}
	public void setProdCategoryID(Integer prodCategoryID) {
		this.prodCategoryID = prodCategoryID;
	}
	public String getProdCategoryDesc() {
		return prodCategoryDesc;
	}
	public void setProdCategoryDesc(String prodCategoryDesc) {
		this.prodCategoryDesc = prodCategoryDesc;
	}
	public Integer getProdWeightClass() {
		return prodWeightClass;
	}
	public void setProdWeightClass(Integer prodWeightClass) {
		this.prodWeightClass = prodWeightClass;
	}
	public String getProdUnitOfMeasure() {
		return prodUnitOfMeasure;
	}
	public void setProdUnitOfMeasure(String prodUnitOfMeasure) {
		this.prodUnitOfMeasure = prodUnitOfMeasure;
	}
	public String getProdPackSize() {
		return prodPackSize;
	}
	public void setProdPackSize(String prodPackSize) {
		this.prodPackSize = prodPackSize;
	}
	public Long getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(Long supplierID) {
		this.supplierID = supplierID;
	}
	public String getProdStatus() {
		return prodStatus;
	}
	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}
	public Double getProdListPrice() {
		return prodListPrice;
	}
	public void setProdListPrice(Double prodListPrice) {
		this.prodListPrice = prodListPrice;
	}
	public Double getProdMinPrice() {
		return prodMinPrice;
	}
	public void setProdMinPrice(Double prodMinPrice) {
		this.prodMinPrice = prodMinPrice;
	}
	public String getProdTotal() {
		return prodTotal;
	}
	public void setProdTotal(String prodTotal) {
		this.prodTotal = prodTotal;
	}
	public Integer getProdTotalID() {
		return prodTotalID;
	}
	public void setProdTotalID(Integer prodTotalID) {
		this.prodTotalID = prodTotalID;
	}
	public Integer getProdSrcID() {
		return prodSrcID;
	}
	public void setProdSrcID(Integer prodSrcID) {
		this.prodSrcID = prodSrcID;
	}
	public Date getProdEffFrom() {
		return prodEffFrom;
	}
	public void setProdEffFrom(Date prodEffFrom) {
		this.prodEffFrom = prodEffFrom;
	}
	public Date getProdEffTo() {
		return prodEffTo;
	}
	public void setProdEffTo(Date prodEffTo) {
		this.prodEffTo = prodEffTo;
	}
	public char getProdValid() {
		return prodValid;
	}
	public void setProdValid(char prodValid) {
		this.prodValid = prodValid;
	}
	
	

}
