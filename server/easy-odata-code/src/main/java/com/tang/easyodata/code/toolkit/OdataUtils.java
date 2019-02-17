package com.tang.easyodata.code.toolkit;

import org.apache.commons.lang3.StringUtils;

import static com.tang.easyodata.code.toolkit.Constants.*;

/**
 * @Description: OdataUtils
 * @Author: tzg
 * @Date: 2019/1/7/007 22:08
 */
public final class OdataUtils {

    /**
     * 是否字段名
     *
     * @param input
     * @return
     */
    public static boolean isFieldName(final CharSequence input) {
        if (StringUtils.isBlank(input)) {
            return false;
        }
        final int len = input.length();
        for (int i = 0; i < len; i++) {
            if (!isFieldNameChar(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 过滤字段名称字符，保证合法性
     *
     * @param input
     * @return
     */
    public static String filterFieldName(final CharSequence input) {
        if (StringUtils.isBlank(input)) {
            return input.toString();
        }
        StringBuilder tmp = new StringBuilder();
        final int len = input.length();
        char pos;
        for (int i = 0; i < len; i++) {
            pos = input.charAt(i);
            if (isFieldNameChar(pos)) {
                tmp.append(pos);
            }
        }
        return tmp.toString();
    }

    /**
     * 过滤值，已保证安全性
     * @param value
     * @return
     */
    public static String filterValue(final CharSequence value) {
        if (StringUtils.isBlank(value)) {
            return value.toString();
        }
        // TODO 未实现
        return value.toString();
    }

    /**
     * 判断是否符合字段名称的字符
     *
     * @param input
     * @return
     */
    public static boolean isFieldNameChar(char input) {
        return Character.isLetterOrDigit(input) || input == SYMBOL_UNDERLINE || input == SYMBOL_PERIOD
                || input == SYMBOL_SLASH || input == SYMBOL_PLUS;
    }

}
