package com.zuihuibao.pagemanage.service;

import com.zuihuibao.pagemanage.dao.InsComPropertyDao;
import com.zuihuibao.pagemanage.model.InsComProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Time : 2020-05-11 17:43
 * @Author : huanghe
 * @File : InsComPropertyService
 * @Software: IntelliJ IDEA
 */
@Service
public class InsComPropertyService {
    @Autowired
    private InsComPropertyDao insComPropertyDao;

    public  InsComProperty findByID(Integer id){
        return insComPropertyDao.selectByPrimaryKey(id);
    };
}
