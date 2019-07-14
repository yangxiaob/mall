package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallShipping;

public interface MallShippingMapper {
    int insert(MallShipping record);

    int insertSelective(MallShipping record);
}