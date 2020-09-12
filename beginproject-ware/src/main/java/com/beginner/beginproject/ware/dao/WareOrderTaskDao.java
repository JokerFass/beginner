package com.beginner.beginproject.ware.dao;

import com.beginner.beginproject.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:38:32
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
