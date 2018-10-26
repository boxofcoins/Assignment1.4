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

        mImageUrls.add("https://www.britishjudo.org.uk/wp-content/uploads/2016/05/Customers-1210x523.png");
        mNames.add("Roles");

        mImageUrls.add("https://image.freepik.com/free-icon/text-document_318-48568.jpg");
        mNames.add("Artifacts");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZs7haU4tmHNwv38FoeZW0-uWuDjm77xZ7UHmTNUwbCSi2ZH_");
        mNames.add("Ceremonies");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Icon-round-Question_mark.svg/768px-Icon-round-Question_mark.svg.png");
        mNames.add("Alternatives");


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
