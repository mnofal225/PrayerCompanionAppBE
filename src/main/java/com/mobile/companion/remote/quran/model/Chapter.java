package com.mobile.companion.remote.quran.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Chapter {
    private int id;
    private String name;
    private String name_simple;
    private String name_arabic;
    private String name_complex;
    private String revelation_place;
    private String revelation_order;
    private int verses_count;
    private List<Integer> pages;
    private TranslatedName translated_name;
}
