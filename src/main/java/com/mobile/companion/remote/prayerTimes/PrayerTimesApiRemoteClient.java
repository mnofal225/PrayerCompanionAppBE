package com.mobile.companion.remote.prayerTimes;

import com.mobile.companion.remote.prayerTimes.model.PrayerTimesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "prayer-times-api", url = "http://api.aladhan.com")
@Component
public interface PrayerTimesApiRemoteClient {

    @GetMapping(value = "/v1/timings/{date}")
    PrayerTimesResponse getPrayerTimesFromRemoteApi(
            @PathVariable("date") String date,
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude,
            @RequestParam("method") int method
    );

}
