package com.mobile.companion.remote.quran.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuranChaptersResponse {
    private List<Chapter> chapters;
}
