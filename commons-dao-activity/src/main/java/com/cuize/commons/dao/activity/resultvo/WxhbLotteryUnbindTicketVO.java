package com.cuize.commons.dao.activity.resultvo;

import java.util.Date;

public class WxhbLotteryUnbindTicketVO {

	private int id; //主键
	
	private String hbType; //红包类型：NORMAL普通红包，GROUP裂变红包
	
	private int totalAmount; //总付金额，单位分
	
	private int totalNum; //红包总发放人数，普通红包1，裂变红包大于1
	
	private Date createTime; //创建时间
	
	private Date expireTime; //失效时间：72小时
	
	private String ticket;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHbType() {
		return hbType;
	}

	public void setHbType(String hbType) {
		this.hbType = hbType;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	
	
}
