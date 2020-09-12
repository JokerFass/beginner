package com.beginner.beginproject.ware.dao;

import com.beginner.beginproject.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:38:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
