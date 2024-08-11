package com.mobile.companion.controller.prayerTimes;

import com.mobile.companion.remote.prayerTimes.model.GetAllPrayersResponse;
import com.mobile.companion.remote.prayerTimes.model.PrayerTimesResponse;
import com.mobile.companion.service.prayerTimes.PrayerTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("sahib/api/v1/prayer-times")
public class PrayerTimesController {
    @Autowired
    private PrayerTimesService prayerTimesService;

@GetMapping(value = "/getPrayerTimes/{date}", headers = "Accept=application/json")
    public PrayerTimesResponse getPrayerTimes(
        @PathVariable String date,
        @RequestParam("latitude") double latitude,
        @RequestParam("longitude") double longitude,
        @RequestParam("method") int method
    ) {
        return prayerTimesService.getPrayerTimes(date, latitude, longitude, method);
    }

    @GetMapping(value = "/getAllPrayers/{date}", headers = "Accept=application/json")
    public GetAllPrayersResponse userDailyPrayers(
        @PathVariable String date,
        @RequestParam("latitude") double latitude,
        @RequestParam("longitude") double longitude,
        @RequestParam("method") int method
    ) {
        return prayerTimesService.userGetAllPrayers(date, latitude, longitude, method);
    }
}
