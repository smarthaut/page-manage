package com.zuihuibao.pagemanage.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ins_com_property
 * @author 
 */
@Data
public class InsComProperty implements Serializable {
    private Integer id;

    /**
     * 保险公司
     */
    private String insuranceCompany;

    /**
     * 对接API
     */
    private String apiProvider;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 机构
     */
    private String district;

    /**
     * 中介渠道id
     */
    private Integer agencyId;

    /**
     * 属性名称
     */
    private String propertyName;

    /**
     * 属性值
     */
    private String propertyValue;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}