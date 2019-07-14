package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallProduct;

public interface MallProductMapper {
    int insert(MallProduct record);

    int insertSelective(MallProduct record);
}