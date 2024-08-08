package com.mobile.companion.remote.quran;

import com.mobile.companion.remote.quran.model.ChapterInfoResponse;
import com.mobile.companion.remote.quran.model.ChapterResponse;
import com.mobile.companion.remote.quran.model.QuranChaptersResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "quran-api", url = "https://api.quran.com/api/v4")
@Component
public interface QuranApiRemoteClient {

    @GetMapping("/chapters")
    QuranChaptersResponse getAllChaptersFromRemoteApi();

    @GetMapping("/chapters/{chapterId}")
    ChapterResponse getChapterFromRemoteApi(@PathVariable("chapterId") int chapterId);

    @GetMapping("/chapters/{chapterId}/info")
    ChapterInfoResponse getChapterInfoFromRemoteApi(@PathVariable("chapterId") int chapterId);

}
