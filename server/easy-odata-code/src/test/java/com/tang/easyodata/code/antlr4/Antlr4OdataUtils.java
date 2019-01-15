package com.tang.easyodata.code.antlr4;

import com.tang.easyodata.code.antlr4.ast.OdataFilterLexer;
import com.tang.easyodata.code.model.OdataFilter;
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
public class Antlr4OdataUtils {

    /**
     * 解析 odata filter 字符串
     *
     * @param filter
     * @return
     */
    public static OdataFilter parseFilter(String filter) {
        if (StringUtils.isNotBlank(filter)) {
            if (log.isDebugEnabled()) {
                log.debug("开始解析过滤条件：{}", filter);
            }
            OdataFilterLexer lexer = new OdataFilterLexer(CharStreams.fromString(filter));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            com.tang.easyodata.code.antlr4.ast.OdataFilterParser filterParser = new com.tang.easyodata.code.antlr4.ast.OdataFilterParser(tokens);

            OdataFilterOperateListener ocl = new OdataFilterOperateListener();
            filterParser.criteriaExpression().enterRule(ocl);
            OdataFilter odataFilter = ocl.getFilter();
            if (log.isDebugEnabled()) {
                log.debug("完成过滤条件解析：{}", odataFilter);
            }
            return odataFilter;
        }
        return null;
    }

}
