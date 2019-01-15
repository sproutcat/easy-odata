package com.tang.easyodata.code.model.enums;

/**
 * @Description: 过滤条件的处理方式
 * @Author: tzg
 * @Date: 2019/1/6/006 18:03
 */
public enum OdataFilterOperateEnum {

    AND,
    OR,

    /**
     * 全包含
     */
    LIKE,

    ENDSWITH,

    STARTSWITH,
    /**
     * 不包含
     */
    NOT_LIKE,
    /**
     * 等于
     */
    EQ,
    /**
     * 不等于
     */
    NE,
    /**
     * 大于
     */
    GT,
    /**
     * 大于等于
     */
    GE,
    /**
     * 小于
     */
    LT,
    /**
     * 小于等于
     */
    LE,

    IN,
    /**
     * 为空
     */
    IS_NULL,
    /**
     * 不为空
     */
    NOT_NULL,
    ;

}
