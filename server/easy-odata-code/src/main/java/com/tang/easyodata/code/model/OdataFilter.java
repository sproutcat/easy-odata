package com.tang.easyodata.code.model;

import com.tang.easyodata.code.model.enums.OdataFilterOperateEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

/**
 * @Description: odata 过滤实体
 * @Author: tzg
 * @Date: 2019/1/6 17:28
 */
@Data
@NoArgsConstructor
public class OdataFilter extends OdataField {

    /**
     * 操作方式
     */
    private OdataFilterOperateEnum operate;
    /**
     * 过滤的值
     */
    private Object value;

    public OdataFilter(String fieldName, String value) {
        this.fieldName = fieldName;
        this.operate = OdataFilterOperateEnum.EQ;
        this.value = value;
    }

    public OdataFilter(String fieldName, OdataFilterOperateEnum operate, Object value) {
        this.fieldName = fieldName;
        this.operate = operate;
        this.value = value;
    }

    public static OdataFilter addLogic(OdataFilterOperateEnum logic, OdataFilter... odataFilter) {
        if (ArrayUtils.isEmpty(odataFilter)) {
            return null;
        }
        if (!OdataFilterOperateEnum.OR.equals(logic)) {
            logic = OdataFilterOperateEnum.AND;
        }
        return new OdataFilter(null, logic, odataFilter);
    }

}
