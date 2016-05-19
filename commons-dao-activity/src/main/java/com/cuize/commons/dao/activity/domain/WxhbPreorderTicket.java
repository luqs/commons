package com.cuize.commons.dao.activity.domain;

/**
 * 微信红包预下单ticket关联表
 * @author JackieLan
 *
 */
public class WxhbPreorderTicket extends BasicEntity{

	private int id; //主键
	
	private int hbPreorderId; // 预下单记录ID
	
	private String ticket; // 预下单ticket信息
	
	private int status = 0; //ticket状态：0未绑定，1已绑定

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHbPreorderId() {
		return hbPreorderId;
	}

	public void setHbPreorderId(int hbPreorderId) {
		this.hbPreorderId = hbPreorderId;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	} 
}
