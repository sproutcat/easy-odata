package com.tang.easyodata.code.toolkit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Description: JSON工具类（jackson的实现）
 *
 * @author: tzg
 * @date: 2017/12/20 19:58
 */
public final class JacksonUtils {

    public final static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(sdf);
        TimeZone timeZone = TimeZone.getTimeZone("GMT+8");
        objectMapper.setTimeZone(timeZone);
    }

    /**
     * 对象转为json字符串
     *
     * @param obj
     * @return
     */
    public static String objectToString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }

}