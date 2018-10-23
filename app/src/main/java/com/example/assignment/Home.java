package com.example.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class Home extends AppCompatActivity {


    private static final String TAG = "Home";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://images.unsplash.com/photo-1533604511324-5eefa6632944?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3c6152189a3755dd61428a751ff9a2e5&auto=format&fit=crop&w=500&q=60");
        mNames.add("Introduction");

        mImageUrls.add("https://images.unsplash.com/photo-1533604511324-5eefa6632944?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3c6152189a3755dd61428a751ff9a2e5&auto=format&fit=crop&w=500&q=60");
        mNames.add("Roles");

        mImageUrls.add("https://images.unsplash.com/photo-1533604511324-5eefa6632944?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3c6152189a3755dd61428a751ff9a2e5&auto=format&fit=crop&w=500&q=60");
        mNames.add("Ceremonies");

        mImageUrls.add("https://images.unsplash.com/photo-1533604511324-5eefa6632944?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3c6152189a3755dd61428a751ff9a2e5&auto=format&fit=crop&w=500&q=60");
        mNames.add("Artifacts");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls,this   );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));



    }
}
