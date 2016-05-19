package com.cuize.commons.dao.activity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cuize.commons.dao.activity.domain.WxhbLottery;
import com.cuize.commons.dao.activity.domain.WxhbLotteryTicket;

/**
 * 微信红包活动接口
 * @author JackieLan
 *
 */
public interface WxhbLotteryMapper {

	/**
	 * 新增微信红包活动信息
	 * @param preorder
	 * @return
	 */
	public int insertWxhbLottery(WxhbLottery lottery);
	
	/**
	 * 更新微信红包活动信息
	 * @param lottery
	 * @return
	 */
	public int updateWxhbLottery(WxhbLottery lottery);
	
	/**
	 * 根据ID查询红包活动信息
	 * @param id
	 * @return
	 */
	public WxhbLottery queryWxhbLotteryById(int id);
	
	/**
	 * 根据lotteryId查询红包活动信息
	 * @param lotteryId
	 * @return
	 */
	public WxhbLottery queryWxhbLotteryByLotteryId(String lotteryId);
	
	/**
	 * 更新红包活动状态
	 * @param status
	 * @param id
	 * @return
	 */
	public int updateWxhbLotteryStatus(@Param("status") int status, @Param("id") int id);
	
/*	public List<WxhbLottery> queryWxhbLotteryByPage();
	
	public int countWxhbLotteryPage();*/
	
	/**
	 * 批量插入红包活动录入ticket信息
	 * @param list
	 * @return
	 */
	public int batchInsertWxhbLotteryTicket(List<WxhbLotteryTicket> list);
	
	/**
	 * 更新红包活动ticket绑定关系
	 * @param lottery
	 * @return
	 */
	public int updateWxhbLotteryTicket(WxhbLotteryTicket lotteryTicket);
}
