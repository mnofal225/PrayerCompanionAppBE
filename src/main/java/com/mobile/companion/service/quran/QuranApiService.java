package com.mobile.companion.service.quran;

import com.mobile.companion.remote.quran.QuranApiRemoteClient;
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

    public String getAllChapters() {

        return quranApiRemoteClient.getAllChaptersFromRemoteApi();
    }

    public String getChapter(int chapterId) {
        return quranApiRemoteClient.getChapterFromRemoteApi(chapterId);
    }

    public String getChapterInfo(int chapterId) {
        return quranApiRemoteClient.getChapterInfoFromRemoteApi(chapterId);
    }

    public String getChapterV2(int chapterId) {
        String chapterInfo = getChapterInfo(chapterId);
        String chapter = getChapter(chapterId);

        String chapterV2 = chapterInfo + "\n" + chapter;

        return chapterV2;
    }
}
