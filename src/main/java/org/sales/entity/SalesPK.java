package org.sales.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalesPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "PROD_ID")
	private Long prodID;
	@Column(name = "CUST_ID")
	private Integer custID;
	@Column(name = "TIME_ID")
	private Date timeID;
	@Column(name = "CHANNEL_ID")
	private Integer channelID;
	
	public SalesPK() {
		super();
	}
	public SalesPK(Long prodID, Integer custID, Date timeID, Integer channelID) {
		this.prodID = prodID;
		this.custID = custID;
		this.timeID = timeID;
		this.channelID = channelID;
	}

	public Long getProdID() {
		return prodID;
	}

	public void setProdID(Long prodID) {
		this.prodID = prodID;
	}

	public Integer getCustID() {
		return custID;
	}

	public void setCustID(Integer custID) {
		this.custID = custID;
	}

	public Date getTimeID() {
		return timeID;
	}

	public void setTimeID(Date timeID) {
		this.timeID = timeID;
	}

	public Integer getChannelID() {
		return channelID;
	}

	public void setChannelID(Integer channelID) {
		this.channelID = channelID;
	}
	
	
	

}
