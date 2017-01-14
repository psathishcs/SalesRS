package org.sales.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHANNELS")
public class Channels implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CHANNEL_ID")
	private Integer channelID;
	@Column(name = "CHANNEL_DESC")
	private String channelDesc;
	@Column(name = "CHANNEL_CLASS")
	private String channelClass;
	@Column(name = "CHANNEL_CLASS_ID")
	private Integer channelClassID;
	@Column(name = "CHANNEL_TOTAL")
	private String channelTotal;
	@Column(name = "CHANNEL_TOTAL_ID")
	private Integer channelTotalID;
	public Integer getChannelID() {
		return channelID;
	}
	public void setChannelID(Integer channelID) {
		this.channelID = channelID;
	}
	public String getChannelDesc() {
		return channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
	public String getChannelClass() {
		return channelClass;
	}
	public void setChannelClass(String channelClass) {
		this.channelClass = channelClass;
	}
	public Integer getChannelClassID() {
		return channelClassID;
	}
	public void setChannelClassID(Integer channelClassID) {
		this.channelClassID = channelClassID;
	}
	public String getChannelTotal() {
		return channelTotal;
	}
	public void setChannelTotal(String channelTotal) {
		this.channelTotal = channelTotal;
	}
	public Integer getChannelTotalID() {
		return channelTotalID;
	}
	public void setChannelTotalID(Integer channelTotalID) {
		this.channelTotalID = channelTotalID;
	}
}
