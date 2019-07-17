package com.tang.easyodata.code.parser;

import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.parser.ast.OdataFilterLexer;
import com.tang.easyodata.code.parser.ast.OdataFilterParser;
import com.tang.easyodata.code.parser.listener.OdataFilterOperateListener;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description: Antlr4OdataUtils
 * @Author: tzg
 * @Date: 2019/1/10/010 1:15
 */
@Slf4j
public class Antlr4FilterParser extends BaseParser<OdataFilter> {

    public Antlr4FilterParser(String input) {
        super(input);
    }

    @Override
    public OdataFilter parse() {
        return parseFilter(input);
    }

    /**
     * 解析 odata filter 字符串
     *
     * @param filter
     * @return
     */
    public static OdataFilter parseFilter(String filter) {
        if (StringUtils.isNotBlank(filter)) {
//            if (log.isDebugEnabled()) {
//                log.debug("开始解析过滤条件：{}", filter);
//            }
            OdataFilterLexer lexer = new OdataFilterLexer(CharStreams.fromString(filter));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OdataFilterParser filterParser = new OdataFilterParser(tokens);

            OdataFilterOperateListener ocl = new OdataFilterOperateListener();
            filterParser.criteriaExpression().enterRule(ocl);
            OdataFilter odataFilter = ocl.getFilter();
//            if (log.isDebugEnabled()) {
//                log.debug("完成过滤条件解析：{}", odataFilter);
//            }
            return odataFilter;
        }
        return null;
    }

}
