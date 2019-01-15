package com.tang.easyodata.code.model;

import lombok.Data;

import java.io.Serializable;

/**
 * odata 参数输入实体
 * @author tzg
 */
@Data
public class OdataInput implements Serializable {

    /**
     * 最大行数
     */
    private long top;
    /**
     * 跳过的行数
     */
    private long skip;
    /**
     * 数据主键
     */
    private String id;
    /**
     * 查询字段
     */
    private String select;
    /**
     * 过滤条件
     */
    private String filter;
    /**
     * 排序条件
     */
    private String orderby;
    /**
     * 计算数据行数(allpages/none)
     */
    private boolean inlinecount;

}
