package com.example.danny.drivesafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mPoints;
    private ListView mListView;
    private Button map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPoints = findViewById(R.id.mPoints);
        mListView = findViewById(R.id.mOutput);
        map = findViewById(R.id.mMaps);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setIcon(R.drawable.icon);
        //Test , not going to be in final version
        Session d1 = new Session(true,100,"Sept 20 2018");
        Session d2 = new Session(true,200, "Sept 21 2018");
        ArrayList<Session> data = new ArrayList<>();
        data.add(d1);//test code
        data.add(d2);//test code


        MyAdapter adapter = new MyAdapter(this,data);
        mListView.setAdapter(adapter);
        map = findViewById(R.id.mMaps);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }



    });



    }

}
