package com.cuize.commons.dao.activity.domain;

import java.util.Date;

/**
 * 微信红包预下单
 * @author JackieLan
 *
 */
public class WxhbPreorder extends BasicEntity{
	
	private int id; //主键
	
	private String mchId; //商户号
	
	private String mchBillNo; //商户订单号
	
	private String mchName; //商户名称
	
	private String hbType; //红包类型：NORMAL普通红包，GROUP裂变红包
	
	private int totalAmount; //总付金额，单位分
	
	private int totalNum; //红包总发放人数，普通红包1，裂变红包大于1
	
	private String amtType; //红包金额设置方式，只对裂变红包有效。ALL_RAND全部随机
	
	private String wishing; //红包祝福语
	
	private String actName; //活动名称
	
	private String remark; //备注信息
	
	private String detailId; //红包内部订单号
	
	private String sendTime; //红包发放时间
	
	private String result; //预下单结果，success成功，fail失败

	private Date expireTime; //失效时间：72小时

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getMchBillNo() {
		return mchBillNo;
	}

	public void setMchBillNo(String mchBillNo) {
		this.mchBillNo = mchBillNo;
	}

	public String getMchName() {
		return mchName;
	}

	public void setMchName(String mchName) {
		this.mchName = mchName;
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

	public String getAmtType() {
		return amtType;
	}

	public void setAmtType(String amtType) {
		this.amtType = amtType;
	}

	public String getWishing() {
		return wishing;
	}

	public void setWishing(String wishing) {
		this.wishing = wishing;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
}
