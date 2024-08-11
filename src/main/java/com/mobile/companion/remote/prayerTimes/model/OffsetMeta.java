package com.mobile.companion.remote.prayerTimes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OffsetMeta {
    @JsonProperty("Imsak")
    private int imsak;

    @JsonProperty("Fajr")
    private int fajr;

    @JsonProperty("Sunrise")
    private int sunrise;

    @JsonProperty("Dhuhr")
    private int dhuhr;

    @JsonProperty("Asr")
    private int asr;

    @JsonProperty("Sunset")
    private int sunset;

    @JsonProperty("Maghrib")
    private int maghrib;

    @JsonProperty("Isha")
    private int isha;

    @JsonProperty("Midnight")
    private int midnight;

}
