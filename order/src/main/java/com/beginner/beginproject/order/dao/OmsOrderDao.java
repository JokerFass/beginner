package com.beginner.beginproject.order.dao;

import com.beginner.beginproject.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:13:19
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
