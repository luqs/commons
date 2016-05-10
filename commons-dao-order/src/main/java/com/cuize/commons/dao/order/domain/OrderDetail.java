package com.cuize.commons.dao.order.domain;

import java.util.Date;

public class OrderDetail {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.order_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.counts_
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer counts;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_sku_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String shopSkuId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer shopProductId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.third_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String thirdProductId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.cn_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double cnTotalFee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.en_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double enTotalFee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.cn_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double cnPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.en_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double enPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_sku_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String shopSkuName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_product_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String shopProductName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.reality_counts
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double realityCounts;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.reality_totalFee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double realityTotalfee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.toconfirm
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer toconfirm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.toDeliver
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer todeliver;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.freight
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double freight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.state_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer stateId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shopbuyprice
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double shopbuyprice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.stat
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer stat;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.ticket_day
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Date ticketDay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.valid_days
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer validDays;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.pay_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double payPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.account_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Double accountPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String shopName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.shop_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer shopId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.day_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer dayTicketType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.person_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer personTicketType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.season_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer seasonTicketType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.remark
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.product_packtype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer productPacktype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.third_order_no
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String thirdOrderNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.barcode_value
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String barcodeValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.barcode_url
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private String barcodeUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.ticket_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer ticketSystype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.gate_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer gateSystype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.is_payfirst
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer isPayfirst;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.create_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.update_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_detail.version
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	private Integer version;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.id
	 * @return  the value of order_detail.id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.id
	 * @param id  the value for order_detail.id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.order_id
	 * @return  the value of order_detail.order_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.order_id
	 * @param orderId  the value for order_detail.order_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.counts_
	 * @return  the value of order_detail.counts_
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getCounts() {
		return counts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.counts_
	 * @param counts  the value for order_detail.counts_
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_sku_id
	 * @return  the value of order_detail.shop_sku_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getShopSkuId() {
		return shopSkuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_sku_id
	 * @param shopSkuId  the value for order_detail.shop_sku_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopSkuId(String shopSkuId) {
		this.shopSkuId = shopSkuId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_product_id
	 * @return  the value of order_detail.shop_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getShopProductId() {
		return shopProductId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_product_id
	 * @param shopProductId  the value for order_detail.shop_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.third_product_id
	 * @return  the value of order_detail.third_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getThirdProductId() {
		return thirdProductId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.third_product_id
	 * @param thirdProductId  the value for order_detail.third_product_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setThirdProductId(String thirdProductId) {
		this.thirdProductId = thirdProductId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.cn_total_fee
	 * @return  the value of order_detail.cn_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getCnTotalFee() {
		return cnTotalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.cn_total_fee
	 * @param cnTotalFee  the value for order_detail.cn_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setCnTotalFee(Double cnTotalFee) {
		this.cnTotalFee = cnTotalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.en_total_fee
	 * @return  the value of order_detail.en_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getEnTotalFee() {
		return enTotalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.en_total_fee
	 * @param enTotalFee  the value for order_detail.en_total_fee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setEnTotalFee(Double enTotalFee) {
		this.enTotalFee = enTotalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.cn_price
	 * @return  the value of order_detail.cn_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getCnPrice() {
		return cnPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.cn_price
	 * @param cnPrice  the value for order_detail.cn_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setCnPrice(Double cnPrice) {
		this.cnPrice = cnPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.en_price
	 * @return  the value of order_detail.en_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getEnPrice() {
		return enPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.en_price
	 * @param enPrice  the value for order_detail.en_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setEnPrice(Double enPrice) {
		this.enPrice = enPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_sku_name
	 * @return  the value of order_detail.shop_sku_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getShopSkuName() {
		return shopSkuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_sku_name
	 * @param shopSkuName  the value for order_detail.shop_sku_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopSkuName(String shopSkuName) {
		this.shopSkuName = shopSkuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_product_name
	 * @return  the value of order_detail.shop_product_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getShopProductName() {
		return shopProductName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_product_name
	 * @param shopProductName  the value for order_detail.shop_product_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopProductName(String shopProductName) {
		this.shopProductName = shopProductName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.reality_counts
	 * @return  the value of order_detail.reality_counts
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getRealityCounts() {
		return realityCounts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.reality_counts
	 * @param realityCounts  the value for order_detail.reality_counts
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setRealityCounts(Double realityCounts) {
		this.realityCounts = realityCounts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.reality_totalFee
	 * @return  the value of order_detail.reality_totalFee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getRealityTotalfee() {
		return realityTotalfee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.reality_totalFee
	 * @param realityTotalfee  the value for order_detail.reality_totalFee
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setRealityTotalfee(Double realityTotalfee) {
		this.realityTotalfee = realityTotalfee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.toconfirm
	 * @return  the value of order_detail.toconfirm
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getToconfirm() {
		return toconfirm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.toconfirm
	 * @param toconfirm  the value for order_detail.toconfirm
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setToconfirm(Integer toconfirm) {
		this.toconfirm = toconfirm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.toDeliver
	 * @return  the value of order_detail.toDeliver
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getTodeliver() {
		return todeliver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.toDeliver
	 * @param todeliver  the value for order_detail.toDeliver
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setTodeliver(Integer todeliver) {
		this.todeliver = todeliver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.freight
	 * @return  the value of order_detail.freight
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getFreight() {
		return freight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.freight
	 * @param freight  the value for order_detail.freight
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setFreight(Double freight) {
		this.freight = freight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.state_id
	 * @return  the value of order_detail.state_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getStateId() {
		return stateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.state_id
	 * @param stateId  the value for order_detail.state_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shopbuyprice
	 * @return  the value of order_detail.shopbuyprice
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getShopbuyprice() {
		return shopbuyprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shopbuyprice
	 * @param shopbuyprice  the value for order_detail.shopbuyprice
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopbuyprice(Double shopbuyprice) {
		this.shopbuyprice = shopbuyprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.stat
	 * @return  the value of order_detail.stat
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getStat() {
		return stat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.stat
	 * @param stat  the value for order_detail.stat
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setStat(Integer stat) {
		this.stat = stat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.ticket_day
	 * @return  the value of order_detail.ticket_day
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Date getTicketDay() {
		return ticketDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.ticket_day
	 * @param ticketDay  the value for order_detail.ticket_day
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setTicketDay(Date ticketDay) {
		this.ticketDay = ticketDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.valid_days
	 * @return  the value of order_detail.valid_days
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getValidDays() {
		return validDays;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.valid_days
	 * @param validDays  the value for order_detail.valid_days
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setValidDays(Integer validDays) {
		this.validDays = validDays;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.pay_price
	 * @return  the value of order_detail.pay_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getPayPrice() {
		return payPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.pay_price
	 * @param payPrice  the value for order_detail.pay_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setPayPrice(Double payPrice) {
		this.payPrice = payPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.account_price
	 * @return  the value of order_detail.account_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Double getAccountPrice() {
		return accountPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.account_price
	 * @param accountPrice  the value for order_detail.account_price
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setAccountPrice(Double accountPrice) {
		this.accountPrice = accountPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_name
	 * @return  the value of order_detail.shop_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_name
	 * @param shopName  the value for order_detail.shop_name
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.shop_id
	 * @return  the value of order_detail.shop_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getShopId() {
		return shopId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.shop_id
	 * @param shopId  the value for order_detail.shop_id
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.day_ticket_type
	 * @return  the value of order_detail.day_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getDayTicketType() {
		return dayTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.day_ticket_type
	 * @param dayTicketType  the value for order_detail.day_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setDayTicketType(Integer dayTicketType) {
		this.dayTicketType = dayTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.person_ticket_type
	 * @return  the value of order_detail.person_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getPersonTicketType() {
		return personTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.person_ticket_type
	 * @param personTicketType  the value for order_detail.person_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setPersonTicketType(Integer personTicketType) {
		this.personTicketType = personTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.season_ticket_type
	 * @return  the value of order_detail.season_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getSeasonTicketType() {
		return seasonTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.season_ticket_type
	 * @param seasonTicketType  the value for order_detail.season_ticket_type
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setSeasonTicketType(Integer seasonTicketType) {
		this.seasonTicketType = seasonTicketType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.remark
	 * @return  the value of order_detail.remark
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.remark
	 * @param remark  the value for order_detail.remark
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.product_packtype
	 * @return  the value of order_detail.product_packtype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getProductPacktype() {
		return productPacktype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.product_packtype
	 * @param productPacktype  the value for order_detail.product_packtype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setProductPacktype(Integer productPacktype) {
		this.productPacktype = productPacktype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.third_order_no
	 * @return  the value of order_detail.third_order_no
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getThirdOrderNo() {
		return thirdOrderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.third_order_no
	 * @param thirdOrderNo  the value for order_detail.third_order_no
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setThirdOrderNo(String thirdOrderNo) {
		this.thirdOrderNo = thirdOrderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.barcode_value
	 * @return  the value of order_detail.barcode_value
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getBarcodeValue() {
		return barcodeValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.barcode_value
	 * @param barcodeValue  the value for order_detail.barcode_value
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setBarcodeValue(String barcodeValue) {
		this.barcodeValue = barcodeValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.barcode_url
	 * @return  the value of order_detail.barcode_url
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public String getBarcodeUrl() {
		return barcodeUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.barcode_url
	 * @param barcodeUrl  the value for order_detail.barcode_url
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setBarcodeUrl(String barcodeUrl) {
		this.barcodeUrl = barcodeUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.ticket_systype
	 * @return  the value of order_detail.ticket_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getTicketSystype() {
		return ticketSystype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.ticket_systype
	 * @param ticketSystype  the value for order_detail.ticket_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setTicketSystype(Integer ticketSystype) {
		this.ticketSystype = ticketSystype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.gate_systype
	 * @return  the value of order_detail.gate_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getGateSystype() {
		return gateSystype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.gate_systype
	 * @param gateSystype  the value for order_detail.gate_systype
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setGateSystype(Integer gateSystype) {
		this.gateSystype = gateSystype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.is_payfirst
	 * @return  the value of order_detail.is_payfirst
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getIsPayfirst() {
		return isPayfirst;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.is_payfirst
	 * @param isPayfirst  the value for order_detail.is_payfirst
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setIsPayfirst(Integer isPayfirst) {
		this.isPayfirst = isPayfirst;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.create_time
	 * @return  the value of order_detail.create_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.create_time
	 * @param createTime  the value for order_detail.create_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.update_time
	 * @return  the value of order_detail.update_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.update_time
	 * @param updateTime  the value for order_detail.update_time
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_detail.version
	 * @return  the value of order_detail.version
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_detail.version
	 * @param version  the value for order_detail.version
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}