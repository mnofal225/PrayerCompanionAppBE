package com.mobile.companion.controller.quran;

import com.mobile.companion.remote.quran.model.ChapterInfoResponse;
import com.mobile.companion.remote.quran.model.ChapterResponse;
import com.mobile.companion.remote.quran.model.ChapterV2Response;
import com.mobile.companion.remote.quran.model.QuranChaptersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.mobile.companion.service.quran.QuranApiService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("sahib/api/v1/quran")
public class QuranApiController {

    @Autowired
    private QuranApiService quranApiService;

    @GetMapping(value = "/getUserChaptersTest", headers = "Accept=application/json")
    public QuranChaptersResponse getUserChapters() {
        return quranApiService.getAllChapters();
    }

    @GetMapping(value = "/getUserChapters/{chapterId}", headers = "Accept=application/json")
    public ChapterResponse getChapter(@PathVariable int chapterId) {
        return quranApiService.getChapter(chapterId);
    }

    @GetMapping(value = "/getChapterInfo/{chapterId}", headers = "Accept=application/json")
    public ChapterInfoResponse getChapterInfo(@PathVariable int chapterId) {
        return quranApiService.getChapterInfo(chapterId);
    }

    @GetMapping(value = "/getUserChapterDetails/{chapterId}", headers = "Accept=application/json")
    public ChapterV2Response getUserChapterV2(@PathVariable int chapterId) {
        return quranApiService.getChapterV2(chapterId);
    }
}
