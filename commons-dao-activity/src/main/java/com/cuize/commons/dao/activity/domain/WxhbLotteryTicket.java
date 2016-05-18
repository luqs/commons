package com.cuize.commons.dao.activity.domain;

import java.math.BigDecimal;

/**
 * 微信红包活动与ticket等关联信息
 * @author JackieLan
 *
 */
public class WxhbLotteryTicket extends BasicEntity{

	private int id; // 主键
	
	private int hbLotteryId; // 红包活动记录ID
	
	private String ticket; //预下单ticket信息
	
	private String openId; //用户openId
	
	private String lotteryId; //微信生成的红包活动ID
	
	private int bindTime; //红包绑定时间，UNIX系统时间格式
	
	private BigDecimal money; //红包金额

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(String lotteryId) {
		this.lotteryId = lotteryId;
	}

	public int getBindTime() {
		return bindTime;
	}

	public void setBindTime(int bindTime) {
		this.bindTime = bindTime;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
}
