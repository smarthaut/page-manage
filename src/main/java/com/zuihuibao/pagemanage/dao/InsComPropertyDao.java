package com.zuihuibao.pagemanage.dao;

import com.zuihuibao.pagemanage.model.InsComProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Time : 2020-05-12 10:49
 * @Author : huanghe
 * @File : InsComPropertyDao
 * @Software: IntelliJ IDEA
 */
@Repository
public class InsComPropertyDao implements InsComPropertyMapper {

    @Autowired
    private  InsComPropertyMapper insComPropertyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(InsComProperty record) {
        return 0;
    }

    @Override
    public int insertSelective(InsComProperty record) {
        return 0;
    }

    @Override
    public InsComProperty selectByPrimaryKey(Integer id) {
        return insComPropertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(InsComProperty record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(InsComProperty record) {
        return 0;
    }
}
