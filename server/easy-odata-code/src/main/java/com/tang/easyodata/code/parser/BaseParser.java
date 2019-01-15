package com.tang.easyodata.code.parser;

/**
 * @Description: 基础解析器
 * @Author: tzg
 * @Date: 2019/1/7/007 21:59
 */
public abstract class BaseParser<T> {

    /**
     * 原始字符串
     */
    public final String input;

    public BaseParser(String input) {
        this.input = input;
    }

    /**
     * 语法解析
     * @return
     */
    public abstract T parse();

}
