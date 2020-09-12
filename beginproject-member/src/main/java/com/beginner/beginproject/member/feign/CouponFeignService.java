package com.beginner.beginproject.member.feign;

import com.beginner.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/getMemberCoupons")
    public R memberCoupons();
}
