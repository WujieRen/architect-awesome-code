package com.architectawesome.cornerstone.date;


import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by renwujie on 2018/06/28 at 0:13
 */
public class CalendarTest {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();


    }
}
