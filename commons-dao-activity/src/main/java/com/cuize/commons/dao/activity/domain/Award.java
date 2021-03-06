package com.cuize.commons.dao.activity.domain;

import java.util.Date;

public class Award {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column award.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column award.award_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String awardCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column award.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column award.award_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String awardUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column award.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private Date createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column award.id
	 * @return  the value of award.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column award.id
	 * @param id  the value for award.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column award.award_code
	 * @return  the value of award.award_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getAwardCode() {
		return awardCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column award.award_code
	 * @param awardCode  the value for award.award_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setAwardCode(String awardCode) {
		this.awardCode = awardCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column award.name
	 * @return  the value of award.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column award.name
	 * @param name  the value for award.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column award.award_url
	 * @return  the value of award.award_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getAwardUrl() {
		return awardUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column award.award_url
	 * @param awardUrl  the value for award.award_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setAwardUrl(String awardUrl) {
		this.awardUrl = awardUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column award.create_time
	 * @return  the value of award.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column award.create_time
	 * @param createTime  the value for award.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}