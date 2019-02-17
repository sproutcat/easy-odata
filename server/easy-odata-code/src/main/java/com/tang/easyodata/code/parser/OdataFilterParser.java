package com.tang.easyodata.code.parser;

import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.model.enums.OdataFilterOperateEnum;
import org.apache.commons.lang3.StringUtils;

import static com.tang.easyodata.code.toolkit.Constants.SYMBOL_ANTI_BRACKET;
import static com.tang.easyodata.code.toolkit.Constants.SYMBOL_BRACKETS;

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
        return parseLogic(input);
    }

    /**
     * 解析逻辑处理
     *
     * @return
     */
    public OdataFilter parseLogic(final String str) {
        OdataFilter filter = new OdataFilter();
        filter.setOperate(OdataFilterOperateEnum.AND);
        int pos = 0, len = str.length(), start = 0, end = len;
        boolean beginMatch = false, endMatch = false;
        while (pos < len) {
            if (str.charAt(pos) == SYMBOL_BRACKETS) {
                if (pos == 0 || Character.isWhitespace(str.charAt(pos - 1))) {
                    beginMatch = true;
                    start = ++pos;
                    continue;
                }
            }
            if (beginMatch && !endMatch && str.charAt(pos) == SYMBOL_ANTI_BRACKET) {
                endMatch = true;
                end = pos - 1;
            }
            pos++;
        }
        if (beginMatch && endMatch) {
            System.out.println(str.substring(start, end));
        }
        return filter;
    }

    /**
     * 解析操作方式
     *
     * @return
     */
    public OdataFilter parseOperate(final String str) {
        return null;
    }

}
