package com.cuize.commons.dao.activity.mapper;

import java.util.List;

import com.cuize.commons.dao.activity.domain.WxhbPreorder;
import com.cuize.commons.dao.activity.domain.WxhbPreorderTicket;

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
	/*
	public List<WxhbPreorder> queryWxhbPreorderByPage();
	
	public int countWxhbPreorderByPage();*/

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
}
