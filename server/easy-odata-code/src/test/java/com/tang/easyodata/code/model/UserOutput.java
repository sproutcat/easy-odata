package com.tang.easyodata.code.model;

import lombok.Data;

import java.util.List;

/**
 * @Description: 用户信息输出实体
 * @Author: tzg
 * @Date: 2019/1/10/010 0:25
 */
@Data
public class UserOutput implements IOdataOutput<UserVo> {

    /**
     * 数据总数
     */
    private long count;
    /**
     * 单条记录
     */
    private UserVo record;
    /**
     * 记录集合
     */
    private List<UserVo> records;

}
