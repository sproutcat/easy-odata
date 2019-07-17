package com.tang.easyodata.code;

import com.tang.easyodata.code.model.OdataFilter;
import com.tang.easyodata.code.model.OdataOrderby;
import com.tang.easyodata.code.parser.Antlr4FilterParser;
import com.tang.easyodata.code.parser.OrderbyParser;
import com.tang.easyodata.code.toolkit.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
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
        String filter = "username eq 'aa' e (username eq 'bb' o username lt '1' o (gender ge 10 e gender le 30) o contains('test',fullname)) e contains('admin',username) e (gender ge 20 e gender le 40)";
        log.debug("原始字符串： {}", filter);
        log.debug("原始字符长度： {}", filter.length());

        OdataFilter odataFilter = new Antlr4FilterParser(filter).parse();

        log.debug("antlr4 解析过滤条件： {}", JacksonUtils.objectToString(odataFilter));

    }


    @Test
    public void odataOrderby() {
        String orderby = ",;createTime*'' asc,gender desc,gender desc 111,username";
        List<OdataOrderby> odatabyList = new OrderbyParser(orderby).parse();

        log.debug("原始字符串： {}", orderby);
        log.debug("排序： {}", JacksonUtils.objectToString(odatabyList));
    }

}
