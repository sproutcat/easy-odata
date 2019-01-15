package com.tang.easyodata.code.model;

import com.tang.easyodata.code.model.enums.OdataOrderbyTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 排序实体
 * @Author: tzg
 * @Date: 2019/1/6/006 17:31
 */
@Data
@NoArgsConstructor
public class OdataOrderby extends OdataField {

    /**
     * 排序方式（默认为升序）
     */
    private OdataOrderbyTypeEnum typeEnum;

    public OdataOrderby(String fieldName) {
        this.fieldName = fieldName;
        this.typeEnum = OdataOrderbyTypeEnum.ASC;
    }

    public OdataOrderby(String fieldName, OdataOrderbyTypeEnum typeEnum) {
        this.fieldName = fieldName;
        this.typeEnum = typeEnum;
    }
}
