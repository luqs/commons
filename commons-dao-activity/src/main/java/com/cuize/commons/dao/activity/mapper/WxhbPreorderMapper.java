package com.cuize.commons.dao.activity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cuize.commons.dao.activity.domain.WxhbPreorder;
import com.cuize.commons.dao.activity.domain.WxhbPreorderTicket;
import com.cuize.commons.dao.activity.queryvo.common.Page;
import com.cuize.commons.dao.activity.queryvo.preorder.PreorderQueryVO;

/**
 * 微信红包预下单接口
 * @author JackieLan
 *
 */
public interface WxhbPreorderMapper {

	/**
	 * 新增微信红包预下单信息
	 * @param preorder
	 * @return
	 */
	public int insertWxhbPreorder(WxhbPreorder preorder);
	
	/**
	 * 更新微信红包预下单信息
	 * @param preorder
	 * @return
	 */
	public int updateWxhbPreorder(WxhbPreorder preorder);
	
	/**
	 * 分页查询预下单
	 * @param page
	 * @param query
	 * @return
	 */
	public List<WxhbPreorder> queryWxhbPreorderByPage(@Param("page")Page page, @Param("query")PreorderQueryVO query);
	
	/**
	 * 统计总数量
	 * @param query
	 * @return
	 */
	public int countWxhbPreorderByPage(@Param("query")PreorderQueryVO query);

	/**
	 * 查询预下单详情
	 * @param id
	 * @return
	 */
	public WxhbPreorder queryWxhbPreorderById(int id);
	
	/**
	 * 新增微信红包预下单ticket关联信息
	 * @param ticket
	 * @return
	 */
	public int insertWxhbPreorderTicket(WxhbPreorderTicket ticket);
	
	/**
	 * 根据微信红包预下单ticket关联信息更新状态
	 * @param ticket
	 * @return
	 */
	public int updateWxhbPreorderTicketStatusByTicket(List<String> ticketList);
	
	/**
	 * 根据预下单ID查询ticket
	 * @param preorderId
	 * @return
	 */
	public WxhbPreorderTicket queryWxhbPreorderTicketByPreorderId(int preorderId);
}
