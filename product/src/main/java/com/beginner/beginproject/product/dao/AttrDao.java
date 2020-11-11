package com.beginner.beginproject.product.dao;

import com.beginner.beginproject.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-02 18:00:10
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
