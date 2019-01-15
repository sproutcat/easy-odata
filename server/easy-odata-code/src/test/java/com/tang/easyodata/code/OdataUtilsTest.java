package com.tang.easyodata.code;

import com.tang.easyodata.code.toolkit.OdataUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @Description: OdataUtilsTest
 * @Author: tzg
 * @Date: 2019/1/7/007 23:08
 */
@Slf4j
public class OdataUtilsTest {

    /**
     * 比较两种方式判断字段名的效率
     */
    @Test
    public void isFieldName() {
        String orderby = "username asc";
        int len = orderby.length(), start = len;
        for (int i = 0; i < len; i++) {
            if (Character.isWhitespace(i)) {
                start = i;
                break;
            }
        }
        log.debug("fieldName: {},{}", orderby.substring(0, start - 1), orderby.substring(start));

        long startTime = System.currentTimeMillis();
        log.debug("===>> 0 数据准备： {}", startTime);
        String test = "aaaaaa_a1231.ssdfs_2324";
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            tmp.append(test);
        }
        tmp.append("A+");
        long endTime = System.currentTimeMillis();
        log.debug("===>> 0 数据准备 耗时：{} 毫秒", endTime - startTime);

        startTime = System.currentTimeMillis();
        log.debug("===>> 1 字符匹配: {}", startTime);
        boolean isName = OdataUtils.isFieldName(tmp);
        endTime = System.currentTimeMillis();
        log.debug("===>> 1 字符匹配： {}, 耗时：{} 毫秒", isName, endTime - startTime);

        startTime = System.currentTimeMillis();
        log.debug("===>> 2 正则表达式： {}", startTime);
        isName = !Pattern.compile("[^\\w\\/\\.\\+]").matcher(tmp).find();
        endTime = System.currentTimeMillis();
        log.debug("===>> 2 正则表达式： {}, 耗时：{} 毫秒", isName, endTime - startTime);
    }

}
