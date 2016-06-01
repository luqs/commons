package com.cuize.commons.dao.activity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cuize.commons.dao.activity.domain.WxhbLottery;
import com.cuize.commons.dao.activity.domain.WxhbLotteryTicket;
import com.cuize.commons.dao.activity.queryvo.common.Page;
import com.cuize.commons.dao.activity.queryvo.lottery.WxLotteryQueryVO;
import com.cuize.commons.dao.activity.queryvo.preorder.WxPreorderQueryVO;
import com.cuize.commons.dao.activity.resultvo.WxhbLotteryBindTicketVO;
import com.cuize.commons.dao.activity.resultvo.WxhbLotteryUnbindTicketVO;

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
	
	/**
	 * 分页查询红包活动
	 * @param page
	 * @param query
	 * @return
	 */
	public List<WxhbLottery> queryWxhbLotteryByPage(@Param("page")Page page, @Param("query")WxLotteryQueryVO query);
	
	/**
	 * 统计红包活动
	 * @param query
	 * @return
	 */
	public int countWxhbLotteryPage(@Param("query")WxLotteryQueryVO query);
	
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
	
	/**
	 * 分页查询红包活动绑定得红包
	 * @param page
	 * @param id
	 * @return
	 */
	public List<WxhbLotteryBindTicketVO> queryWxhbLotteryBindTicketByPage(@Param("page")Page page, @Param("hbLotteryId")int id);
	
	/**
	 * 统计红包活动绑定的红包
	 * @param id
	 * @return
	 */
	public int countWxhbLotteryBindTicketByPage(@Param("hbLotteryId")int id);
	
	/**
	 * 分页查询未使用且有效的红包
	 * @param page
	 * @return
	 */
	public List<WxhbLotteryUnbindTicketVO> queryUnBindTicketByPage(@Param("page")Page page);
	
	/**
	 * 统计未使用且有效的红包
	 * @param page
	 * @return
	 */
	public int countUnBindTicketByPage(@Param("page")Page page);
	
	
	public WxhbLottery queryWxhbLotteryByCzhbLotteryId(int czhbLotteryId);
}
