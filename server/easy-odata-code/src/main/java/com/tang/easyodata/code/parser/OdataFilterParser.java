package com.tang.easyodata.code.parser;

import com.tang.easyodata.code.model.OdataFilter;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description: odata 过滤条件字符串解析器
 * @Author: tzg
 * @Date: 2019/1/6/006 18:18
 */
public class OdataFilterParser extends BaseParser<OdataFilter> {

    public OdataFilterParser(String input) {
        super(input);
    }

    @Override
    public OdataFilter parse() {
        if (StringUtils.isBlank(input)) {
            return null;
        }
        return parseLogic();
    }

    /**
     * 解析逻辑处理
     * @return
     */
    public OdataFilter parseLogic() {
        return null;
    }

    /**
     * 解析操作方式
     * @return
     */
    public OdataFilter parseOperate() {
        return null;
    }

}
