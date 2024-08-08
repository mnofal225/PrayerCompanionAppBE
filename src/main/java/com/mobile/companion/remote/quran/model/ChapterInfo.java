package com.mobile.companion.remote.quran.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChapterInfo {
    private int id;
    private int chapter_id;
    private String language_name;
    private String short_text;
    private String source;
    private String text;
}
