package com.example.com.test.model;

import com.example.com.test.myinterfac.Item;
import com.example.com.test.myinterfac.ItemType;

/**
 * Created by 749 on 8/14/2015.
 */
public class Footer implements Item {
    @Override
    public ItemType getItemType() {
        return ItemType.Footer;
    }
}
