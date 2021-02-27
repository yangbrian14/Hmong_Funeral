package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<String> {
    private Activity context;
    private ArrayList<String> donorNames;
    private ArrayList<String> donations;

    public MyListAdapter(Activity context, ArrayList<String> donorNames, ArrayList<String> donations){
        super(context, R.layout.mylist, donorNames);
        this.context = context;
        this.donorNames = donorNames;
        this.donations = donations;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView donor = (TextView) rowView.findViewById(R.id.donor);
        TextView donation = (TextView) rowView.findViewById(R.id.donation);

        donor.setText(donorNames.get(position));
        donation.setText(donations.get(position));

        return rowView;
    }
}
