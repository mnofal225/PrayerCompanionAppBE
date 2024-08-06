package com.mobile.companion.remote.quran;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "quran-api", url = "https://api.quran.com/api/v4")
@Component
public interface QuranApiRemoteClient {

    @GetMapping("/chapters")
    String getAllChaptersFromRemoteApi();

    @GetMapping("/chapters/{chapterId}")
    String getChapterFromRemoteApi(@PathVariable("chapterId") int chapterId);

    @GetMapping("/chapters/{chapterId}/info")
    String getChapterInfoFromRemoteApi(@PathVariable("chapterId") int chapterId);

}
