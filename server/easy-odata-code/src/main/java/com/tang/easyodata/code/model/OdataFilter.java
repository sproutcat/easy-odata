package com.tang.easyodata.code.model;

import com.tang.easyodata.code.model.enums.OdataFilterOperateEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Description: odata 过滤实体
 * @Author: tzg
 * @Date: 2019/1/6 17:28
 */
@Getter
@Setter
@NoArgsConstructor
public class OdataFilter<T> extends OdataField {

    /**
     * 操作方式
     */
    protected OdataFilterOperateEnum operate;
    /**
     * 过滤的值
     */
    protected T value;

    public OdataFilter(String fieldName, T value) {
        this.fieldName = fieldName;
        this.operate = OdataFilterOperateEnum.EQ;
        this.value = value;
    }

    public OdataFilter(String fieldName, OdataFilterOperateEnum operate, T value) {
        this.fieldName = fieldName;
        this.operate = operate;
        this.value = value;
    }

    /**
     * 创建逻辑过滤对象
     * @param logic
     * @param odataFilter
     * @return
     */
    public static OdataFilter buildLogicFilter(OdataFilterOperateEnum logic, OdataFilter... odataFilter) {
        return buildLogicFilter(logic, Arrays.asList(odataFilter));
    }

    /**
     * 创建逻辑过滤对象
     * @param logic
     * @param odataFilter
     * @return
     */
    public static OdataFilter buildLogicFilter(OdataFilterOperateEnum logic, Collection<OdataFilter> odataFilter) {
        if (CollectionUtils.isEmpty(odataFilter)) {
            return null;
        }
        if (!OdataFilterOperateEnum.OR.equals(logic)) {
            logic = OdataFilterOperateEnum.AND;
        }
        return new OdataFilter(null, logic, odataFilter);
    }

    @Override
    public String toString() {
        return "OdataFilter{" +
                "fieldName='" + fieldName + '\'' +
                ", operate=" + operate +
                ", value=" + value +
                '}';
    }
}
