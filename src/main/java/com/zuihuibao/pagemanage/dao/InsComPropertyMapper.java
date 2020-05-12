package com.zuihuibao.pagemanage.dao;

import com.zuihuibao.pagemanage.model.InsComProperty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InsComPropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsComProperty record);

    int insertSelective(InsComProperty record);

    InsComProperty selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(InsComProperty record);

    int updateByPrimaryKey(InsComProperty record);
}