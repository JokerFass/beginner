package com.beginner.beginproject.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:25:13
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

