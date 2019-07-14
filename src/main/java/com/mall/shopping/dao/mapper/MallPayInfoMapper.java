package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallPayInfo;

public interface MallPayInfoMapper {
    int insert(MallPayInfo record);

    int insertSelective(MallPayInfo record);
}