package com.example.com.test.model;

import com.example.com.test.myinterfac.Item;
import com.example.com.test.myinterfac.ItemType;

/**
 * Created by 749 on 8/14/2015.
 */
public class Detail implements Item {
    @Override
    public ItemType getItemType() {
        return ItemType.Detail;
    }

    private String title;
    private String author;
    private String user;
    private String monney;

    public Detail(String title, String author, String user, String monney) {
        this.title = title;
        this.author = author;
        this.user = user;
        this.monney = monney;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMonney() {
        return monney;
    }

    public void setMonney(String monney) {
        this.monney = monney;
    }
}
