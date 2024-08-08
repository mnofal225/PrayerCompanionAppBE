package com.mobile.companion.service.quran;

import com.mobile.companion.remote.quran.QuranApiRemoteClient;
import com.mobile.companion.remote.quran.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class QuranApiService {

    @Autowired
    private final QuranApiRemoteClient quranApiRemoteClient;

    public QuranApiService(QuranApiRemoteClient quranApiRemoteClient) {
        this.quranApiRemoteClient = quranApiRemoteClient;
    }

    public QuranChaptersResponse getAllChapters() {
        return quranApiRemoteClient.getAllChaptersFromRemoteApi();
    }

    public ChapterResponse getChapter(int chapterId) {
        return quranApiRemoteClient.getChapterFromRemoteApi(chapterId);
    }

    public ChapterInfoResponse getChapterInfo(int chapterId) {
        return quranApiRemoteClient.getChapterInfoFromRemoteApi(chapterId);
    }

    public ChapterV2Response getChapterV2(int chapterId) {
        ChapterResponse chapterDetails = quranApiRemoteClient.getChapterFromRemoteApi(chapterId);
        ChapterInfoResponse chapterInfoDetails = quranApiRemoteClient.getChapterInfoFromRemoteApi(chapterId);

        ChapterV2Response chapterV2Response = new ChapterV2Response();
            chapterV2Response.setChapterId(chapterId);
            chapterV2Response.setChapterName(chapterDetails.getChapter().getName_simple());
            chapterV2Response.setChapterNameArabic(chapterDetails.getChapter().getName_arabic());
            chapterV2Response.setChapterNameTranslation(chapterDetails.getChapter().getTranslated_name().getName());
            chapterV2Response.setShortText(chapterInfoDetails.getChapter_info().getShort_text());

        return chapterV2Response;
    }
}
