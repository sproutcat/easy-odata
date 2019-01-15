package com.tang.easyodata.code.model;

import com.tang.easyodata.code.model.enums.OdataFunctionEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 函数调用实体
 * @Author: tzg
 * @Date: 2019/1/6/006 18:13
 */
@Data
public class OdataFunction implements Serializable {

    /**
     * 函数
     */
    private OdataFunctionEnum functionEnum;

}
