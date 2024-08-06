package com.mobile.companion.controller.quran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mobile.companion.service.quran.QuranApiService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("sahib/api/v1/quran")
public class QuranApiController {

    @Autowired
    private QuranApiService quranApiService;

    @GetMapping("/getUserChapters")
    public String getUserChapters() {
        return quranApiService.getAllChapters();
    }

    @GetMapping("/getUserChapters/{chapterId}")
    public String getChapter(@PathVariable int chapterId) {
        return quranApiService.getChapter(chapterId);
    }

    @GetMapping("/getChapterInfo/{chapterId}")
    public String getChapterInfo(@PathVariable int chapterId) {
        return quranApiService.getChapterInfo(chapterId);
    }

    @GetMapping("/getChapterV2/{chapterId}")
    public String getChapterV2(@PathVariable int chapterId) {
        return quranApiService.getChapterV2(chapterId);
    }
}
