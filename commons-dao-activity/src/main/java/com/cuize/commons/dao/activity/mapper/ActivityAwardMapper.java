package com.cuize.commons.dao.activity.mapper;

import com.cuize.commons.dao.activity.domain.ActivityAward;
import com.cuize.commons.dao.activity.domain.ActivityAwardExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ActivityAwardMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int countByExample(ActivityAwardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int deleteByExample(ActivityAwardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int insert(ActivityAward record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int insertSelective(ActivityAward record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	List<ActivityAward> selectByExample(ActivityAwardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	ActivityAward selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ActivityAward record,
			@Param("example") ActivityAwardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int updateByExample(@Param("record") ActivityAward record,
			@Param("example") ActivityAwardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int updateByPrimaryKeySelective(ActivityAward record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_award
	 * @mbggenerated  Wed Apr 27 16:46:59 CST 2016
	 */
	int updateByPrimaryKey(ActivityAward record);
}