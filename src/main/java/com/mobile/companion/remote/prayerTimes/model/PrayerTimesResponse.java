package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrayerTimesResponse {
    private int code;
    private String status;
    private PrayerTimesData data;
}
