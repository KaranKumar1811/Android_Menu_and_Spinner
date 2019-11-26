package com.example.android_menu_and_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int flags[];
    String[] countryNames;
    LayoutInflater infalter;

    public CustomAdapter(Context applicationContext, int[] flags, String[] countryNames) {
        this.context = applicationContext;
        this.flags = flags;
        this.countryNames = countryNames;
        infalter = (LayoutInflater.from(applicationContext));
    }



    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = infalter.inflate(R.layout.custom_spinner,null);
        ImageView icon = (ImageView) view.findViewById(R.id.countryicon);
        TextView names = (TextView) view.findViewById(R.id.countrtlst);
        icon.setImageResource(flags[i]);
        names.setText(countryNames[i]);
        return view;
    }
}
