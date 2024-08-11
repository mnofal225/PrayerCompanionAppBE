package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrayerTimesMeta {
    private double latitude;
    private double longitude;
    private String timezone;
    private MethodMeta method;
    private String latitudeAdjustmentMethod;
    private String midnightMode;
    private String school;
    private OffsetMeta offset;
}
