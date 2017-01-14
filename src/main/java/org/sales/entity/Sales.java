package org.sales.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SALES")
public class Sales implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalesPK salesPK;
	
	@Column(name = "PROMO_ID")
	private  Long promoID;
	@Column(name = "QUANTITY_SOLD")
	private Double quantitySold;
	@Column(name = "AMOUNT_SOLD")
	private Double amountSold;
	public SalesPK getSalesPK() {
		return salesPK;
	}
	public void setSalesPK(SalesPK salesPK) {
		this.salesPK = salesPK;
	}
	public Long getPromoID() {
		return promoID;
	}
	public void setPromoID(Long promoID) {
		this.promoID = promoID;
	}
	public Double getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(Double quantitySold) {
		this.quantitySold = quantitySold;
	}
	public Double getAmountSold() {
		return amountSold;
	}
	public void setAmountSold(Double amountSold) {
		this.amountSold = amountSold;
	}
	
}
