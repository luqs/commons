package com.cuize.commons.dao.order.mapper;

import com.cuize.commons.dao.order.domain.ProductStock;
import com.cuize.commons.dao.order.domain.ProductStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductStockMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int countByExample(ProductStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int deleteByExample(ProductStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int deleteByPrimaryKey(Integer productId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int insert(ProductStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int insertSelective(ProductStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	List<ProductStock> selectByExample(ProductStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	ProductStock selectByPrimaryKey(Integer productId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ProductStock record,
			@Param("example") ProductStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int updateByExample(@Param("record") ProductStock record,
			@Param("example") ProductStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int updateByPrimaryKeySelective(ProductStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_stock
	 * @mbggenerated  Fri May 20 18:19:39 CST 2016
	 */
	int updateByPrimaryKey(ProductStock record);
}