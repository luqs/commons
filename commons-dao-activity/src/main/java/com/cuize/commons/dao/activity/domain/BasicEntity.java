package com.cuize.commons.dao.activity.domain;

import java.util.Date;

public class BasicEntity {

	private Date createTime; //创建时间
	
	private Date updateTime; //更新时间

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
