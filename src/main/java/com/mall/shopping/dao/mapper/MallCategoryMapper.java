package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallCategory;

public interface MallCategoryMapper {
    int insert(MallCategory record);

    int insertSelective(MallCategory record);
}