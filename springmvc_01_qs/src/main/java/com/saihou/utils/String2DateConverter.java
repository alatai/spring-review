package com.saihou.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 22:49
 */
public class String2DateConverter implements Converter<String, Date> {

    /**
     * @param s 传入进来的值
     */
    @Override
    public Date convert(String s) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // 字符串转换为日期
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("解析出错");
        }
    }
}
