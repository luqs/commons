package com.cuize.commons.dao.order.mapper;

import com.cuize.commons.dao.order.domain.OrderDetailPackdtl;
import com.cuize.commons.dao.order.domain.OrderDetailPackdtlExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderDetailPackdtlMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int countByExample(OrderDetailPackdtlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int deleteByExample(OrderDetailPackdtlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int insert(OrderDetailPackdtl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int insertSelective(OrderDetailPackdtl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	List<OrderDetailPackdtl> selectByExample(OrderDetailPackdtlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	OrderDetailPackdtl selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int updateByExampleSelective(@Param("record") OrderDetailPackdtl record,
			@Param("example") OrderDetailPackdtlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int updateByExample(@Param("record") OrderDetailPackdtl record,
			@Param("example") OrderDetailPackdtlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int updateByPrimaryKeySelective(OrderDetailPackdtl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_detail_packdtl
	 * @mbggenerated  Tue May 10 18:00:46 CST 2016
	 */
	int updateByPrimaryKey(OrderDetailPackdtl record);
}