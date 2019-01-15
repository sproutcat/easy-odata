package com.tang.easyodata.code.model;

import java.util.List;

/**
 * @Description: Odata 查询结果输出接口
 * @Author: tzg
 * @Date: 2019/1/6/006 18:46
 */
public interface IOdataOutput<T> {

    /**
     * 获取行数
     * @return
     */
    long getCount();

    /**
     * 获取记录
     * @return
     */
    T getRecord();

    /**
     * 获取记录集
     * @return
     */
    List<T> getRecords();

}
