package com.beginner.beginproject.member.dao;

import com.beginner.beginproject.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:32:00
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
