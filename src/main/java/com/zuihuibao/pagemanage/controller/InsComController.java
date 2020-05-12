package com.zuihuibao.pagemanage.controller;

import com.zuihuibao.pagemanage.model.InsComProperty;
import com.zuihuibao.pagemanage.service.InsComPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time : 2020-05-11 17:49
 * @Author : huanghe
 * @File : InsComController
 * @Software: IntelliJ IDEA
 */
@RestController
public class InsComController {
    @Autowired
    private InsComPropertyService insComPropertyService;

    @RequestMapping(value = "api/ins-com", method = RequestMethod.GET)
    public InsComProperty findByID(@RequestParam(value = "id", required = true) Integer id) {
        return insComPropertyService.findByID(id);
    }
}
