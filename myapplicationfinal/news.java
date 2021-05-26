package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplicationfinal.newsadapter;

public class news extends AppCompatActivity {
//        private String[] arr = {"Buy google.","Don't buy stocks."};
//    ListView list;
    TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
//        newsadapter t = new newsadapter(this,R.layout.newslayout, arr);
//        list.setAdapter(t);
        textView7 = findViewById(R.id.textView7);
        textView7.setText("Never buy stocks");

    }
}