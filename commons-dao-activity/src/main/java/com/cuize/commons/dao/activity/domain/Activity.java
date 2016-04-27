package com.cuize.commons.dao.activity.domain;

import java.util.Date;

public class Activity {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity.activity_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String activityCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity.h5_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private String h5Url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	private Date createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity.id
	 * @return  the value of activity.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity.id
	 * @param id  the value for activity.id
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity.activity_code
	 * @return  the value of activity.activity_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity.activity_code
	 * @param activityCode  the value for activity.activity_code
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity.name
	 * @return  the value of activity.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity.name
	 * @param name  the value for activity.name
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity.h5_url
	 * @return  the value of activity.h5_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public String getH5Url() {
		return h5Url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity.h5_url
	 * @param h5Url  the value for activity.h5_url
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setH5Url(String h5Url) {
		this.h5Url = h5Url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity.create_time
	 * @return  the value of activity.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity.create_time
	 * @param createTime  the value for activity.create_time
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}