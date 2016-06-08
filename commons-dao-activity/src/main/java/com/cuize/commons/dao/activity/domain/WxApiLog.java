package com.cuize.commons.dao.activity.domain;

/**
 * 微信接口调用记录
 * @author Administrator
 *
 */
public class WxApiLog extends BasicEntity{

	private int id;
	
	private String apiName; // 接口名称
	
	private String apiDesc; // 接口描述
	
	private String req; // 请求
	
	private String rsp; //响应

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiDesc() {
		return apiDesc;
	}

	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}
	
	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}

	public String getRsp() {
		return rsp;
	}

	public void setRsp(String rsp) {
		this.rsp = rsp;
	}

	
}
