package com.cuize.commons.dao.activity.resultvo;

import java.util.Date;

public class WxhbLotteryBindTicketVO {
	
	private int hbLotteryId; // 红包活动记录ID
	
	private String ticket; //预下单ticket信息
	
	private String title; //红包活动标题
	
	private Date createTime; //创建时间
	
	private Date updateTime; //更新时间

	public int getHbLotteryId() {
		return hbLotteryId;
	}

	public void setHbLotteryId(int hbLotteryId) {
		this.hbLotteryId = hbLotteryId;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
