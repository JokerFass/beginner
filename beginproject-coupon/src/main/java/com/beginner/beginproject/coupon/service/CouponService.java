package com.beginner.beginproject.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-07 15:25:13
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

