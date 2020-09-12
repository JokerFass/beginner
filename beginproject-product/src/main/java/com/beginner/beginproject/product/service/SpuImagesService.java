package com.beginner.beginproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beginner.common.utils.PageUtils;
import com.beginner.beginproject.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author ZhangWQ
 * @email m13319597680@163.com
 * @date 2020-09-02 18:00:10
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

