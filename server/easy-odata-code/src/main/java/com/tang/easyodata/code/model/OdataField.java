package com.tang.easyodata.code.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: OdataField
 * @Author: tzg
 * @Date: 2019/1/10/010 0:18
 */
@Data
public class OdataField implements Serializable {

    /**
     * 字段名称
     */
    protected String fieldName;

}
