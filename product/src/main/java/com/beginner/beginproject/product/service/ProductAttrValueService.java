package com.beginner.beginproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-02 18:00:10
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

