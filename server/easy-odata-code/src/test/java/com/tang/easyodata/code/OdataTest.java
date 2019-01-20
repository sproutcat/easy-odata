package com.tang.easyodata.code;

import com.tang.easyodata.code.antlr4.Antlr4OdataUtils;
import com.tang.easyodata.code.antlr4.OdataFilterOperateListener;
import com.tang.easyodata.code.antlr4.ast.OdataFilterLexer;
import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.model.OdataOrderby;
import com.tang.easyodata.code.parser.OdataFilterParser;
import com.tang.easyodata.code.parser.OdataOrderbyParser;
import com.tang.easyodata.code.toolkit.JacksonUtils;
import com.tang.easyodata.code.toolkit.OdataUtils;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;

/**
 * @Description: OdataTest
 * @Author: tzg
 * @Date: 2019/1/6/006 19:05
 */
@Slf4j
public class OdataTest {

    @Test
    public void odataFilter() {
        String filter = "username eq 'aa' e (username eq 'aa' o username lt '1') e contains('admin',username)";
        log.debug("原始字符串： {}", filter);

        OdataFilter odataFilter = new OdataFilterParser(filter).parse();
        log.debug("字符解析过滤条件： {}", JacksonUtils.objectToString(odataFilter));

        odataFilter = Antlr4OdataUtils.parseFilter(filter);

        log.debug("antlr4 解析过滤条件： {}", JacksonUtils.objectToString(odataFilter));
    }

    @Test
    public void odataOrderby() {
        String orderby = ",;createTime*'' asc,gender desc,gender desc 111,username";
        List<OdataOrderby> odatabyList = new OdataOrderbyParser(orderby).parse();

        log.debug("原始字符串： {}", orderby);
        log.debug("排序： {}", JacksonUtils.objectToString(odatabyList));
    }

}
