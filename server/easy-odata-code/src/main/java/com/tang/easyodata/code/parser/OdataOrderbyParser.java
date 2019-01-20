package com.tang.easyodata.code.parser;

import com.tang.easyodata.code.model.OdataOrderby;
import com.tang.easyodata.code.toolkit.OdataUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.tang.easyodata.code.model.enums.OdataOrderbyTypeEnum.ASC;
import static com.tang.easyodata.code.model.enums.OdataOrderbyTypeEnum.DESC;
import static com.tang.easyodata.code.toolkit.Constants.SYMBOL_COMMA;

/**
 * @Description: odata 排序字符串解析器
 * @Author: tzg
 * @Date: 2019/1/6/006 18:18
 */
@Slf4j
public class OdataOrderbyParser extends BaseParser<List<OdataOrderby>> {

    public OdataOrderbyParser(String input) {
        super(input);
    }

    @Override
    public List<OdataOrderby> parse() {
        if (StringUtils.isBlank(input)) {
            return null;
        }
        int len = input.length(), last = len - 1, i = 0, start = 0;
        List<OdataOrderby> orderbyList = new ArrayList<>();
        OdataOrderby by;
        boolean lastMatch = false;
        while (i < len) {
            if (input.charAt(i) == SYMBOL_COMMA) {
                lastMatch = true;
                if (i > 0) {
                    by = genOrderby(input.substring(start, i));
                    if (null != by) {
                        orderbyList.add(by);
                    }
                }
                start = ++i;
                continue;
            }
            lastMatch = false;
            i++;
        }
        if (!lastMatch) {
            by = genOrderby(input.substring(start, i));
            if (null != by) {
                orderbyList.add(by);
            }
        }
        return orderbyList;
    }

    /**
     * 根据排序实体
     *
     * @param input
     * @return
     */
    public static OdataOrderby genOrderby(String input) {
        if (StringUtils.isBlank(input)) {
            return null;
        }
        final String tmp = input.trim();
        int len = tmp.length(), start = len;
        for (int i = 0; i < len; i++) {
            if (Character.isWhitespace(tmp.charAt(i))) {
                start = i;
                break;
            }
        }
        if (start == len) {
            return new OdataOrderby(tmp);
        }
        // 容错性
        boolean desc = tmp.substring(start + 1).toUpperCase().indexOf(DESC.name()) > -1;
        // TODO 未实现函数解析
        return new OdataOrderby(
                OdataUtils.filterFieldName(tmp.substring(0, start - 1)),
                desc ? DESC : ASC
        );
    }

}
