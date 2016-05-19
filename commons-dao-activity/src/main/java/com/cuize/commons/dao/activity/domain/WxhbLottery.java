package com.cuize.commons.dao.activity.domain;

import java.util.Date;

/**
 * 微信红包活动记录
 * @author JackieLan
 *
 */
public class WxhbLottery  extends BasicEntity{

	private int id; //主键
	
	private int useTemplate; //是否使用模板：1使用，2不使用
	
	private String logoUrl; //使用模板页面的logo_url
	
	private String title; //抽奖活动名称
	
	private String description; //抽奖活动描述
	
	private int status; //抽奖开关：0关闭1开启
	
	private Date beginTime; //抽奖活动开始时间
	
	private Date expireTime; //抽奖活动结束时间
	
	private int total; //红包总数
	
	private String lotteryId; //微信生成的红包活动ID
	
	private int pageId; //微信生成的模板页面ID
	
	private String result; //红包活动生成结果：success成功，fail失败

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUseTemplate() {
		return useTemplate;
	}

	public void setUseTemplate(int useTemplate) {
		this.useTemplate = useTemplate;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(String lotteryId) {
		this.lotteryId = lotteryId;
	}

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
