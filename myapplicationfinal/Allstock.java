package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Allstock extends AppCompatActivity {
    ListView listView;
    private String[]s = {"Google  \n\n Current Price : $10\n Last Day Price : $12",
            "Apple  \n\n Current Price : $10\n Last Day Price : $12",
            "Tesla  \n\n Current Price : $10\n Last Day Price : $12",
            "Reliance  \n\n Current Price : $10\n Last Day Price : $12",
            "Orange  \n\n Current Price : $10\n Last Day Price : $12",
            "Cake  \n\n Current Price : $10\n Last Day Price : $12",
            "Microsoft  \n\n Current Price : $10\n Last Day Price : $12",
            "Axis Bank  \n\n Current Price : $10\n Last Day Price : $12",
            "Tata  \n\n Current Price : $10\n Last Day Price : $12",
            "Bata  \n\n Current Price : $10\n Last Day Price : $12",
            "Tata Steel  \n\n Current Price : $10\n Last Day Price : $12",
            "SBI  \n\n Current Price : $10\n Last Day Price : $12",
            "CBI  \n\n Current Price : $10\n Last Day Price : $12",
            "Hello  \n\n Current Price : $10\n Last Day Price : $12",
            "Tata Tea  \n\n Current Price : $10\n Last Day Price : $12",
            "Tata Motors  \n\n Current Price : $10\n Last Day Price : $12",
            "Bata Motors  \n\n Current Price : $10\n Last Day Price : $12"};
//    private String[]p = {"Current Price : $10","Current Price : $120","Current Price : $15","Current Price : $149","Current Price : $10","Current Price : $30","Current Price : $164.3","Current Price : $12.33","Current Price : $10.22","Current Price : $111","Current Price : $18","Current Price : $19.22","Current Price : $199","Current Price : $11","Current Price : $10","Current Price : $10","Current Price : $10"};
//    private String []c ={"Previous Closing : $12","Previous Closing : $120","Previous Closing : $15","Previous Closing : $150","Previous Closing : $12","Previous Closing : $12","Previous Closing : $33","Previous Closing : $170","Previous Closing : $12","Previous Closing : $12","Previous Closing : $122","Previous Closing : $19","Previous Closing : $210","Previous Closing : $12","Previous Closing : $18.2","Previous Closing : $11.1","Previous Closing : $12"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsac);
        listView = findViewById(R.id.listView);

        // using built in adapter
//        ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,s);
        sachinAdapter ad = new sachinAdapter(this,R.layout.sachinlayout,s);


        listView.setAdapter(ad);


    }
}