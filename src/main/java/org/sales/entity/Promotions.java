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
@Table(name="PROMOTIONS")
public class Promotions implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PROMO_ID")
	private Long promoID;
	@Column(name = "PROMO_NAME")
	private String promoName;
	@Column(name = "PROMO_SUBCATEGORY")
	private String promoSubCategory;
	@Column(name = "PROMO_SUBCATEGORY_ID")
	private Integer promoSubCategoryID;
	@Column(name = "PROMO_CATEGORY")
	private String promoCategory;
	@Column(name = "PROMO_CATEGORY_ID")
	private Integer promoCategoryID;
	@Column(name = "PROMO_COST")
	private double promoCost;
	@Column(name = "PROMO_BEGIN_DATE")
	private Date promoBeginDate;
	@Column(name = "PROMO_END_DATE")
	private Date promoEndDate;
	@Column(name = "PROMO_TOTAL")
	private String promoTotal;
	@Column(name = "PROMO_TOTAL_ID")
	private Integer promoTotalID;
	public Long getPromoID() {
		return promoID;
	}
	public void setPromoID(Long promoID) {
		this.promoID = promoID;
	}
	public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}
	public String getPromoSubCategory() {
		return promoSubCategory;
	}
	public void setPromoSubCategory(String promoSubCategory) {
		this.promoSubCategory = promoSubCategory;
	}
	public Integer getPromoSubCategoryID() {
		return promoSubCategoryID;
	}
	public void setPromoSubCategoryID(Integer promoSubCategoryID) {
		this.promoSubCategoryID = promoSubCategoryID;
	}
	public String getPromoCategory() {
		return promoCategory;
	}
	public void setPromoCategory(String promoCategory) {
		this.promoCategory = promoCategory;
	}
	public Integer getPromoCategoryID() {
		return promoCategoryID;
	}
	public void setPromoCategoryID(Integer promoCategoryID) {
		this.promoCategoryID = promoCategoryID;
	}
	public double getPromoCost() {
		return promoCost;
	}
	public void setPromoCost(double promoCost) {
		this.promoCost = promoCost;
	}
	public Date getPromoBeginDate() {
		return promoBeginDate;
	}
	public void setPromoBeginDate(Date promoBeginDate) {
		this.promoBeginDate = promoBeginDate;
	}
	public Date getPromoEndDate() {
		return promoEndDate;
	}
	public void setPromoEndDate(Date promoEndDate) {
		this.promoEndDate = promoEndDate;
	}
	public String getPromoTotal() {
		return promoTotal;
	}
	public void setPromoTotal(String promoTotal) {
		this.promoTotal = promoTotal;
	}
	public Integer getPromoTotalID() {
		return promoTotalID;
	}
	public void setPromoTotalID(Integer promoTotalID) {
		this.promoTotalID = promoTotalID;
	}
	
	

}
