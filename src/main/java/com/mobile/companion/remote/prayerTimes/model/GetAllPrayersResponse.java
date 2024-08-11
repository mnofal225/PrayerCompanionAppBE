package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAllPrayersResponse {

    private String fajr;
    private String dhuhr;
    private String asr;
    private String maghrib;
    private String isha;
}
