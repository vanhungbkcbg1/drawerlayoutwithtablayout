package com.example.com.test.model;

import com.example.com.test.myinterfac.Item;
import com.example.com.test.myinterfac.ItemType;

/**
 * Created by 749 on 8/14/2015.
 */
public class Header implements Item {
    @Override
    public ItemType getItemType() {
        return ItemType.Header;
    }

    private String header;
    public Header(String header)
    {
        this.header=header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
