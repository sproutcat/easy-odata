package com.tang.easyodata.code.model.enums;

/**
 * @Description: odata 函数枚举
 * @Author: tzg
 * @Date: 2019/1/6/006 18:49
 */
public enum OdataFunctionEnum {

    /**
     * 未定义
     */
    UNDEFINE,

    CAST,

    //=========数字处理函数=========
    /**
     * 绝对值
     */
    ABS,
    /**
     * 合计
     */
    SUM,
    /**
     * 差数
     */
    DIFF,
    /**
     * 积数
     */
    PROD,
    /**
     * 商数
     */
    QUOT,

    //=========日期处理函数=========
    DATE,
    YEAR,
    MONTH,
    DAY,
    /**
     * 当前时间
     */
    NEW,
    ;

}
