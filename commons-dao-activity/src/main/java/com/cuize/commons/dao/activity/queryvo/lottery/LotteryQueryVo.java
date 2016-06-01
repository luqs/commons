package com.cuize.commons.dao.activity.queryvo.lottery;

public class LotteryQueryVo {

	private int processStatus ; // 0初始化，1处理中，2处理成功，3处理失败

	public int getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}

	
}
