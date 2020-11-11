package com.beginner.beginproject.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:38:32
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

