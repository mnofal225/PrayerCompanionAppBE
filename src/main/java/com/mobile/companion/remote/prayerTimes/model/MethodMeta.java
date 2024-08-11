package com.mobile.companion.remote.prayerTimes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MethodMeta {

    private int id;
    private String name;
    private ParamsMethodMeta params;
    private LocationMethodMeta location;
}
