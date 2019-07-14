package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallOrder;

public interface MallOrderMapper {
    int insert(MallOrder record);

    int insertSelective(MallOrder record);
}