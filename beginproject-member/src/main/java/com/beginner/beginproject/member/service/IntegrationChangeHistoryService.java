package com.beginner.beginproject.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:32:00
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

