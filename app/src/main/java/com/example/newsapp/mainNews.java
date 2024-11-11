package com.example.newsapp;

import java.util.ArrayList;

public class mainNews {

    private String status;
    private String totalReults;
    private ArrayList<ModelClass> articles;

    public mainNews(String status, String totalReults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalReults = totalReults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalReults() {
        return totalReults;
    }

    public void setTotalReults(String totalReults) {
        this.totalReults = totalReults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
