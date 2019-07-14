package com.mall.shopping.dao.mapper;

import com.mall.shopping.pojo.MallUser;

public interface MallUserMapper {
    int insert(MallUser record);

    int insertSelective(MallUser record);
}