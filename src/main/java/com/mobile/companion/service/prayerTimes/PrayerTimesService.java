package com.mobile.companion.service.prayerTimes;

import com.mobile.companion.remote.prayerTimes.PrayerTimesApiRemoteClient;
import com.mobile.companion.remote.prayerTimes.model.GetAllPrayersResponse;
import com.mobile.companion.remote.prayerTimes.model.PrayerTimesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PrayerTimesService {

    @Autowired
    private final PrayerTimesApiRemoteClient prayerTimesApiRemoteClient;

    public PrayerTimesService(PrayerTimesApiRemoteClient prayerTimesApiRemoteClient) {
        this.prayerTimesApiRemoteClient = prayerTimesApiRemoteClient;
    }

    public PrayerTimesResponse getPrayerTimes(String date, double latitude, double longitude, int method) {
        return prayerTimesApiRemoteClient.getPrayerTimesFromRemoteApi(date, latitude, longitude, method);
    }

    public GetAllPrayersResponse userGetAllPrayers(String date, double latitude, double longitude, int method) {
        PrayerTimesResponse response = prayerTimesApiRemoteClient.getPrayerTimesFromRemoteApi(date, latitude, longitude, method);

        GetAllPrayersResponse getAllPrayersResponse = new GetAllPrayersResponse();
        getAllPrayersResponse.setFajr(response.getData().getTimings().getFajr());
        getAllPrayersResponse.setDhuhr(response.getData().getTimings().getDhuhr());
        getAllPrayersResponse.setAsr(response.getData().getTimings().getAsr());
        getAllPrayersResponse.setMaghrib(response.getData().getTimings().getMaghrib());
        getAllPrayersResponse.setIsha(response.getData().getTimings().getIsha());

        return getAllPrayersResponse;
    }
}
