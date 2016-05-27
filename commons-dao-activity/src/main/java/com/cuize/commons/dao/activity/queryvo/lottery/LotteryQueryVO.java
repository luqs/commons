package com.cuize.commons.dao.activity.queryvo.lottery;

public class LotteryQueryVO {

	private int status = 2; // 默认全部，2默认
	
	private String title;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
