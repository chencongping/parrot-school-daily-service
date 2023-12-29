package com.parrot.chengcongping.parrot.school.daily.service.utils;

public enum DateFormatUtil {
    DATE_TIME("yyyy-MM-dd HH:mm:ss"),
    DATE("yyyy-MM-dd"),
    TIME("HH:mm:ss");

    private String format;

    DateFormatUtil(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }
}
