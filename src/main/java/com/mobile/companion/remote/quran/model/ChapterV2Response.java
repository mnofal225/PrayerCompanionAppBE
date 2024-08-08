package com.mobile.companion.remote.quran.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChapterV2Response {
    public int chapterId;
    public String chapterName;
    public String chapterNameArabic;
    public String chapterNameTranslation;
    public String shortText;
}
