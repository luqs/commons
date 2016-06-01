package com.cuize.commons.dao.activity.mapper;

import com.cuize.commons.dao.activity.domain.WxApiLog;

public interface WxApiLogMapper {

	/**
	 * 保存日志
	 * @param log
	 * @return
	 */
	public int saveWxApiLog(WxApiLog log);
	
	/**
	 * 更新日志
	 * @param log
	 * @return
	 */
	public int updateWxApiLog(WxApiLog log);
}
