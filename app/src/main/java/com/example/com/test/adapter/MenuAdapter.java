package com.example.com.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.com.test.R;

/**
 * Created by 749 on 8/13/2015.
 */
public class MenuAdapter extends ArrayAdapter<String> {

    Context context;
    int layout;
    String[] data;
    private static class ViewHolder
    {
        TextView txt;
    }
    public MenuAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.data=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,parent,false);
            ViewHolder viewHolder=new ViewHolder();
            viewHolder.txt=(TextView)convertView.findViewById(R.id.txtMenuItem);
            convertView.setTag(viewHolder);
        }
        ViewHolder viewHolder= (ViewHolder) convertView.getTag();
        viewHolder.txt.setText(data[position]);
        return convertView;
    }
}
