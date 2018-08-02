package com.example.josephfathi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<TemperatureData> items =
                Arrays.asList(new TemperatureData("Hamburg", "5", "http://lorempixel.com/40/40/"),
                        new TemperatureData("Berlin", "6", "http://lorempixel.com/40/40/"));


        // define an adapter
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}
