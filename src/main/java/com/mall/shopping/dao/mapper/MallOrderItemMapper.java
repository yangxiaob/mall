package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallOrderItem;

public interface MallOrderItemMapper {
    int insert(MallOrderItem record);

    int insertSelective(MallOrderItem record);
}