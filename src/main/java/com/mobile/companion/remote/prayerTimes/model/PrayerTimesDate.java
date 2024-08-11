package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrayerTimesDate {

    private String readable;
    private String timestamp;
    private HijiriDate hijri;
    private GregorianDate gregorian;
}
