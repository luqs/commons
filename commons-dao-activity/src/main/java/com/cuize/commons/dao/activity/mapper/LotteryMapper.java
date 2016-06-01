package com.cuize.commons.dao.activity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cuize.commons.dao.activity.domain.Lottery;
import com.cuize.commons.dao.activity.queryvo.common.Page;
import com.cuize.commons.dao.activity.queryvo.lottery.LotteryQueryVo;

public interface LotteryMapper {

	public int insertLottery(Lottery lottery); 
	 
	/**
	 * 查询最新待处理活动
	 * @return
	 */
	public Lottery queryLatestLottery();
	
	/**
	 * 更新活动状态
	 * @param id
	 * @param processStatus
	 * @return
	 */
	public int updateLottery(@Param("id")int id, @Param("processStatus")int processStatus);

	/**
	 * 统计
	 * @param query
	 * @return
	 */
	public int countLotteryByPage(@Param("query")LotteryQueryVo query);

	/**
	 * 分页查询
	 * @param page
	 * @param query
	 * @return
	 */
	public List<Lottery> queryLotteryByPage(@Param("page")Page page, @Param("query")LotteryQueryVo query);
	
}
