package com.example.danny.drivesafe;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Session>{
    public MyAdapter(Context context, ArrayList<Session> sessions){
        super(context,0,sessions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Session session =getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout,parent,false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.mAccident);
        TextView tvHome = (TextView) convertView.findViewById(R.id.mDriven);
        TextView date = convertView.findViewById(R.id.mSession);
        // Populate the data into the template view using the data object
        tvName.setText("Did drive safe? "+String.valueOf(session.driveSafe));
        tvHome.setText("Km driven: "+String.valueOf(session.driven));
        date.setText("Date: "+ session.date);
        return convertView;
    }

}