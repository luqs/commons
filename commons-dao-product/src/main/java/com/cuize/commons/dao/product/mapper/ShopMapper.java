package com.cuize.commons.dao.product.mapper;

import com.cuize.commons.dao.product.domain.Shop;
import com.cuize.commons.dao.product.domain.ShopExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShopMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int countByExample(ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int deleteByExample(ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int insert(Shop record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int insertSelective(Shop record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	List<Shop> selectByExampleWithBLOBs(ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	List<Shop> selectByExample(ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	Shop selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Shop record,
			@Param("example") ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByExampleWithBLOBs(@Param("record") Shop record,
			@Param("example") ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByExample(@Param("record") Shop record,
			@Param("example") ShopExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByPrimaryKeySelective(Shop record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByPrimaryKeyWithBLOBs(Shop record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop
	 * @mbggenerated  Wed Apr 27 17:41:04 CST 2016
	 */
	int updateByPrimaryKey(Shop record);
}