package com.beginner.beginproject.ware.dao;

import com.beginner.beginproject.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:38:32
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
