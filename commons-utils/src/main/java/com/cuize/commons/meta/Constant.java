package com.cuize.commons.meta;

public interface Constant {
	public static final Integer ORDER_STATUS_CREATE = 1;
	public static final Integer ORDER_STATUS_PAID = 2;
	public static final Integer ORDER_STATUS_FINISH = 3;
	public static final Integer ORDER_STATUS_CANCEL = 4;
	
	public static final Integer ORDEROPT_TYPE_CREATE = 1;
	public static final Integer ORDEROPT_TYPE_DELETE = 3;
	public static final Integer ORDEROPT_TYPE_UPDATE = 2;
	public static final Integer ORDEROPT_TYPE_QUERY = 4;
	
	public static final Integer THIRD_SYSTYPE_HIYO = 0;//嗨摇
	public static final Integer THIRD_SYSTYPE_HUANQI = 1;//环企
	public static final Integer THIRD_SYSTYPE_SHENDA = 3;//深大
	
	public static final Integer FIRST_TICKET = 0;//先出票
	public static final Integer FIRST_PAY = 1;//先支付
	
	public static final Integer TICKET_DAYTYPE_TODAY = 1;//当日票
	public static final Integer TICKET_DAYTYPE_OTHERDAY = 2;//预约票
	public static final Integer TICKET_DAYTYPE_NOTDISPLAY = 0;//不显示
	public static final Integer TICKET_DAYTYPE_PACK = 3;//套票（打包票）
	
	public static final Integer PRODUCT_PACKTYPE_NOT = 0;//非打包产品的打包类型
	public static final Integer PRODUCT_PACKTYPE_HUANQI = 1;//打包产品的打包类型
	
	public static final Integer PRODUCT_STATUS_SALES = 1;//上架
	public static final Integer PRODUCT_STATUS_ONLYPACK = 2;//只在打包产品中售卖
	public static final Integer PRODUCT_STATUS_TEMP = 8;//临时票（体验票）
	public static final Integer PRODUCT_STATUS_DELETE = 9;//只在打包产品中售卖
	
	
}
