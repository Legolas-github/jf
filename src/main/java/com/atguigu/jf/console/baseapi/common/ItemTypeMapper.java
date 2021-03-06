package com.atguigu.jf.console.baseapi.common;

import java.util.List;

import com.atguigu.jf.console.common.bean.pojo.ItemType;

public interface ItemTypeMapper {
	
	/**
	 * @methodName: getItemType  
	 * @function: 获取商品类别集合
	 * @return
	 * @author 徐志超 
	 * @date 2016年11月12日
	 */
	List<ItemType> getItemType();

}
