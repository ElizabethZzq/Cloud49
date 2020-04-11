package com.android.springcloud.dao;

public class Payment {
    private Long id;

    private String seriaal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeriaal() {
        return seriaal;
    }

    public void setSeriaal(String seriaal) {
        this.seriaal = seriaal == null ? null : seriaal.trim();
    }
}