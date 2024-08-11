package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrayerTimesData {
    private PrayerTimesTiming timings;
    private PrayerTimesDate date;
    private PrayerTimesMeta meta;
}
