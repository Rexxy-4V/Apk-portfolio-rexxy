package com.example.portofolio.Domain;

public class TrendsDomain {
    private String title;
    private String subtitel;
    private String picAddress;

    public TrendsDomain(String title, String subtitel, String picAddress) {
        this.title = title;
        this.subtitel = subtitel;
        this.picAddress = picAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitel() {
        return subtitel;
    }

    public void setSubtitel(String subtitel) {
        this.subtitel = subtitel;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }
}
