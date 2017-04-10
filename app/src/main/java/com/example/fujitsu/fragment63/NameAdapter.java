
package com.example.fujitsu.fragment63;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 15/02/2017.
 */
public class NameAdapter extends BaseAdapter{
    private LayoutInflater mLayoutInflater;
    private ArrayList<custome> dummyData;


    public NameAdapter(Context Contex, ArrayList<custome> mDummydata) {

        dummyData = mDummydata;

        mLayoutInflater = LayoutInflater.from(Contex);

    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        custome custome = (custome) getItem(position);

                convertView = mLayoutInflater.inflate(R.layout.fragment_secondfrag,parent,false);
                ImageView Name= (ImageView) convertView.findViewById(R.id.yooutube_image);
                TextView Phone = (TextView) convertView.findViewById(R.id.youtube_txt);
                Phone.setText(custome.getName());
                Name.setImageResource(custome.getPhoneno());
                return convertView;
            }

    }

