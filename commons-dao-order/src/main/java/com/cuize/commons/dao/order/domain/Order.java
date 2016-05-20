package com.cuize.commons.dao.order.domain;

import java.util.Date;

public class Order {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.pid
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer pid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.order_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String orderNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.user_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.commit_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Date commitTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.cn_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Double cnDistributionFee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.en_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Double enDistributionFee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.distribution_address_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer distributionAddressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.en_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String enUserEvaluation;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.cn_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String cnUserEvaluation;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.user_name
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.en_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String enRemark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.cn_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String cnRemark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.order_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String orderTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.delivery_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer deliveryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.order_affirmant
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer orderAffirmant;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.shopbuyprice
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Double shopbuyprice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.mobilephone
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String mobilephone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.cert_type
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer certType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.cert_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String certNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.pay_transaction_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String payTransactionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.stat
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer stat;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.wechat_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String wechatId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.open_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String openId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.from_shop
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private String fromShop;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.create_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.update_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_.version
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	private Integer version;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.id
	 * @return  the value of order_.id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.id
	 * @param id  the value for order_.id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.pid
	 * @return  the value of order_.pid
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.pid
	 * @param pid  the value for order_.pid
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.order_no
	 * @return  the value of order_.order_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.order_no
	 * @param orderNo  the value for order_.order_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.user_id
	 * @return  the value of order_.user_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.user_id
	 * @param userId  the value for order_.user_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.commit_time
	 * @return  the value of order_.commit_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Date getCommitTime() {
		return commitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.commit_time
	 * @param commitTime  the value for order_.commit_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCommitTime(Date commitTime) {
		this.commitTime = commitTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.cn_distribution_fee
	 * @return  the value of order_.cn_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Double getCnDistributionFee() {
		return cnDistributionFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.cn_distribution_fee
	 * @param cnDistributionFee  the value for order_.cn_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCnDistributionFee(Double cnDistributionFee) {
		this.cnDistributionFee = cnDistributionFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.en_distribution_fee
	 * @return  the value of order_.en_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Double getEnDistributionFee() {
		return enDistributionFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.en_distribution_fee
	 * @param enDistributionFee  the value for order_.en_distribution_fee
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setEnDistributionFee(Double enDistributionFee) {
		this.enDistributionFee = enDistributionFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.distribution_address_id
	 * @return  the value of order_.distribution_address_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getDistributionAddressId() {
		return distributionAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.distribution_address_id
	 * @param distributionAddressId  the value for order_.distribution_address_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setDistributionAddressId(Integer distributionAddressId) {
		this.distributionAddressId = distributionAddressId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.en_user_evaluation
	 * @return  the value of order_.en_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getEnUserEvaluation() {
		return enUserEvaluation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.en_user_evaluation
	 * @param enUserEvaluation  the value for order_.en_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setEnUserEvaluation(String enUserEvaluation) {
		this.enUserEvaluation = enUserEvaluation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.cn_user_evaluation
	 * @return  the value of order_.cn_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getCnUserEvaluation() {
		return cnUserEvaluation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.cn_user_evaluation
	 * @param cnUserEvaluation  the value for order_.cn_user_evaluation
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCnUserEvaluation(String cnUserEvaluation) {
		this.cnUserEvaluation = cnUserEvaluation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.user_name
	 * @return  the value of order_.user_name
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.user_name
	 * @param userName  the value for order_.user_name
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.en_remark
	 * @return  the value of order_.en_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getEnRemark() {
		return enRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.en_remark
	 * @param enRemark  the value for order_.en_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setEnRemark(String enRemark) {
		this.enRemark = enRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.cn_remark
	 * @return  the value of order_.cn_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getCnRemark() {
		return cnRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.cn_remark
	 * @param cnRemark  the value for order_.cn_remark
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCnRemark(String cnRemark) {
		this.cnRemark = cnRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.order_time
	 * @return  the value of order_.order_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getOrderTime() {
		return orderTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.order_time
	 * @param orderTime  the value for order_.order_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.delivery_id
	 * @return  the value of order_.delivery_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getDeliveryId() {
		return deliveryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.delivery_id
	 * @param deliveryId  the value for order_.delivery_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.order_affirmant
	 * @return  the value of order_.order_affirmant
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getOrderAffirmant() {
		return orderAffirmant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.order_affirmant
	 * @param orderAffirmant  the value for order_.order_affirmant
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setOrderAffirmant(Integer orderAffirmant) {
		this.orderAffirmant = orderAffirmant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.shopbuyprice
	 * @return  the value of order_.shopbuyprice
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Double getShopbuyprice() {
		return shopbuyprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.shopbuyprice
	 * @param shopbuyprice  the value for order_.shopbuyprice
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setShopbuyprice(Double shopbuyprice) {
		this.shopbuyprice = shopbuyprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.mobilephone
	 * @return  the value of order_.mobilephone
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.mobilephone
	 * @param mobilephone  the value for order_.mobilephone
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.cert_type
	 * @return  the value of order_.cert_type
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getCertType() {
		return certType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.cert_type
	 * @param certType  the value for order_.cert_type
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.cert_no
	 * @return  the value of order_.cert_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.cert_no
	 * @param certNo  the value for order_.cert_no
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.pay_transaction_id
	 * @return  the value of order_.pay_transaction_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getPayTransactionId() {
		return payTransactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.pay_transaction_id
	 * @param payTransactionId  the value for order_.pay_transaction_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setPayTransactionId(String payTransactionId) {
		this.payTransactionId = payTransactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.stat
	 * @return  the value of order_.stat
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getStat() {
		return stat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.stat
	 * @param stat  the value for order_.stat
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setStat(Integer stat) {
		this.stat = stat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.wechat_id
	 * @return  the value of order_.wechat_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getWechatId() {
		return wechatId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.wechat_id
	 * @param wechatId  the value for order_.wechat_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.open_id
	 * @return  the value of order_.open_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.open_id
	 * @param openId  the value for order_.open_id
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.from_shop
	 * @return  the value of order_.from_shop
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public String getFromShop() {
		return fromShop;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.from_shop
	 * @param fromShop  the value for order_.from_shop
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setFromShop(String fromShop) {
		this.fromShop = fromShop;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.create_time
	 * @return  the value of order_.create_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.create_time
	 * @param createTime  the value for order_.create_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.update_time
	 * @return  the value of order_.update_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.update_time
	 * @param updateTime  the value for order_.update_time
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_.version
	 * @return  the value of order_.version
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_.version
	 * @param version  the value for order_.version
	 * @mbggenerated  Fri May 20 15:25:42 CST 2016
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}