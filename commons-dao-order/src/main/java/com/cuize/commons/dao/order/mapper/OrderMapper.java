package com.cuize.commons.dao.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cuize.commons.dao.order.domain.Order;
import com.cuize.commons.dao.order.domain.OrderExample;

public interface OrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int countByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int deleteByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int insert(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int insertSelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	List<Order> selectByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	Order selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int updateByPrimaryKeySelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_
	 * @mbggenerated  Mon May 23 15:07:40 CST 2016
	 */
	int updateByPrimaryKey(Order record);
}