package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HijiriDate {
    private String date;
    private String format;
    private String day;
    private WeekdayData weekday;
    private MonthData month;
    private String year;
    private DesignationData designation;
    private List<String> holidays;

}
