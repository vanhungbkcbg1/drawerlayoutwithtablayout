package com.example.com.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.com.test.R;
import com.example.com.test.model.Detail;
import com.example.com.test.model.Header;
import com.example.com.test.myinterfac.Item;
import com.example.com.test.myinterfac.ItemType;

import java.util.List;

/**
 * Created by 749 on 8/14/2015.
 */
public class HomeAdapter extends ArrayAdapter<Item> {

    Context context;
    int layout;
    List<Item> data;

    static class HeaderHolder {
        TextView txt;
    }

    static class DetailHolder {
        TextView txt_title;
        TextView txt_author;
        TextView txt_user;
        TextView txt_money;
    }

    static class FooterHolder {
        ImageView img;
    }

    public HomeAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.data = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item current_item = data.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        int type = getItemViewType(position);
        switch (type) {
            case 0: {
                if (convertView==null)
                {
                    convertView = inflater.inflate(R.layout.header, parent, false);
                    HeaderHolder headerHolder = new HeaderHolder();
                    headerHolder.txt = (TextView) convertView.findViewById(R.id.txt_header);
                    convertView.setTag(headerHolder);
                }
                Header item = (Header) current_item;
                HeaderHolder headerHolder = (HeaderHolder) convertView.getTag();
                headerHolder.txt.setText(item.getHeader());
            }
            break;
            case 1: {
                if (convertView==null)
                {
                    convertView = inflater.inflate(R.layout.detail_home, parent, false);
                    DetailHolder detailHolder = new DetailHolder();
                    detailHolder.txt_title = (TextView) convertView.findViewById(R.id.txt_title);
                    detailHolder.txt_author = (TextView) convertView.findViewById(R.id.txt_author);
                    detailHolder.txt_user = (TextView) convertView.findViewById(R.id.txt_user);
                    detailHolder.txt_money = (TextView) convertView.findViewById(R.id.txt_monney);
                    convertView.setTag(detailHolder);
                }
                Detail item = (Detail) current_item;
                DetailHolder detailHolder = (DetailHolder) convertView.getTag();

                detailHolder.txt_title.setText(item.getTitle());
                detailHolder.txt_author.setText(item.getAuthor());
                detailHolder.txt_user.setText(item.getUser());
                detailHolder.txt_money.setText(item.getMonney());
            }
            break;
            case 2: {
                convertView = inflater.inflate(R.layout.footer, parent, false);
                FooterHolder footerHolder = new FooterHolder();
                footerHolder.img = (ImageView) convertView.findViewById(R.id.img_footer);
                convertView.setTag(footerHolder);
            }
            break;
        }
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position).getItemType() == ItemType.Header) {
            return 0;
        } else if (data.get(position).getItemType() == ItemType.Detail) {
            return 1;
        }
        return 2;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }
}
