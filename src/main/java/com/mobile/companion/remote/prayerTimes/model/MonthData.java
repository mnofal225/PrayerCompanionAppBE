package com.mobile.companion.remote.prayerTimes.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MonthData {

    private int number;
    private String en;
    private String ar;
}
