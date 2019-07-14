package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallCar;

public interface MallCarMapper {
    int insert(MallCar record);

    int insertSelective(MallCar record);
}