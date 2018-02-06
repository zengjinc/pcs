package com.ssm.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import pcs.pool.objectpool.PoolItem;

public class ErrorCode {
	static Map<String, Object> map = new LinkedHashMap<>();
	
	/**
	 *  get code maps, contains code and message.
	 * @param operation
	 * @param size the number of operation return.
	 * @return
	 */
	public static Map<String, Object> Code(String operation,int size){
		//if size is 0, not show this message.
		if(size>=0){
			map.put("0000", ""+operation+" success,lines is : "+size+"" );
		}
		
		map.put("0101", operation+" fail:not null");
		map.put("0102",	operation+" fail:special String");
		map.put("0103",	operation+" fail:column is not exits");
		map.put("0104", operation+" fail:operation is illlegal");
		map.put("0105", operation+" fail:the value is exits");
		map.put("0106", operation+" fail:date format error");
		return map;	
	}
//	public static Map Code(){
//		Map map = new LinkedHashMap();
//		map.put("0000", "success");
//		map.put("0101", "fail:column is not exits");
//		map.put("0102",	"fail:value is illlegal");
//		map.put("0103",	"fail:value is illlegal");
//		map.put("0104",	"fail:value is illlegal");
//		map.put("0105",	"fail:value is illlegal");
//		map.put("0106",	"fail:value is illlegal");
//		map.put("0107",	"fail:value is illlegal");
//		map.put("0108",	"fail:value is illlegal");
//		map.put("0109",	"fail:value is illlegal");
//		return map;	
//	}
}
