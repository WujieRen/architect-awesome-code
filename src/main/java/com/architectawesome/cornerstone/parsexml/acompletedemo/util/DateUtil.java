package com.architectawesome.cornerstone.parsexml.acompletedemo.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by renwujie on 2018/07/02 at 11:36
 */
public class DateUtil {
    public static Date string2Date(String transformFormat, String dateString) {
        DateFormat format = new SimpleDateFormat(transformFormat);
        Date date = null;
        try {
             date = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
