package com.mobile.companion.remote.prayerTimes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrayerTimesTiming {
    @JsonProperty("Fajr")
    private String fajr;

    @JsonProperty("Sunrise")
    private String sunrise;

    @JsonProperty("Dhuhr")
    private String dhuhr;

    @JsonProperty("Asr")
    private String asr;

    @JsonProperty("Maghrib")
    private String maghrib;

    @JsonProperty("Isha")
    private String isha;
}
