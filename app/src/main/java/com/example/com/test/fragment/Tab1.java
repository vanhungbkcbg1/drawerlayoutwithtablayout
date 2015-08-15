package com.example.com.test.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.com.test.R;
import com.example.com.test.adapter.HomeAdapter;
import com.example.com.test.model.Detail;
import com.example.com.test.model.Footer;
import com.example.com.test.model.Header;
import com.example.com.test.myinterfac.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 749 on 8/13/2015.
 */
public class Tab1 extends Fragment {
    ListView listHome;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        listHome = (ListView) view.findViewById(R.id.list_home);
        List<Item> data = new ArrayList<Item>();
        for (Integer i = 0; i < 100; i++) {
            if (i == 0) {
                data.add(new Header("Header"));
            } else if (i % 5 == 0) {

                data.add(new Footer());
                data.add(new Header("Header"));

            } else if (i == 99) {
                data.add(new Footer());
            } else {
                Detail detail=new Detail("Tieu de sach","vanhung","36","800.000VND");
                data.add(detail);
            }
        }

        HomeAdapter adapter=new HomeAdapter(getActivity().getApplicationContext(),1,data);
        listHome.setAdapter(adapter);
        return view;
    }
}
