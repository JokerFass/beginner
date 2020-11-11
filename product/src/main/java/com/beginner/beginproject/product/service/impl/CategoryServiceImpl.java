package com.beginner.beginproject.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.beginner.common.utils.PageUtils;
import com.beginner.common.utils.Query;

import com.beginner.beginproject.product.dao.CategoryDao;
import com.beginner.beginproject.product.entity.CategoryEntity;
import com.beginner.beginproject.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree(){
        //获取所有商品
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        //获取所有商品的一级分类
        List<CategoryEntity> level1Product =categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).map((menu)->{
                menu.setChildCategoryList(getChild(menu, categoryEntities));
                return menu;
            }
        ).sorted((menu1, menu2)->{
            return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort() == null?0:menu2.getSort());
        }).collect(Collectors.toList());

        //获取所有商品的二级分类
        List<CategoryEntity> level2Product = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getCatId() == 2
        ).collect(Collectors.toList());

        //获取所有三级分类商品
        List<CategoryEntity> level3Product = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getCatId() == 3
        ).collect(Collectors.toList());
        return level1Product;
    }

    public List<CategoryEntity> getChild(CategoryEntity nowCategory, List<CategoryEntity> menuList){
        List<CategoryEntity> childList = menuList.stream().filter(categoryEntity -> {
                return categoryEntity.getParentCid().equals(nowCategory.getCatId());
            }
        ).map((menu) -> {
            menu.setChildCategoryList(getChild(menu, menuList));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort() == null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return childList;
    }

}