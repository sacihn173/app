package com.example.myapplicationfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class sachinAdapter extends ArrayAdapter<String> {


    private String[] s;

    public sachinAdapter(@NonNull Context context, int resource, @NonNull String []s) {
        super(context, resource, s);
        this.s  = s;

    }

    @Nullable
    @Override
    public String getItem(int position) {
        return s[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.sachinlayout,parent,false);
        TextView t = convertView.findViewById(R.id.textView5);

        t.setText(getItem(position));

        return convertView;
    }

}
