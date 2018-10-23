package com.example.assignment;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> imageNames, ArrayList<String> images, Context context) {
        mImageNames = imageNames;
        mImages = images;
        mContext = context;
    }



    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called. ");
        Glide.with(mContext)
            .asBitmap()
            .load(mImages.get(position))
            .into(holder.image);
    holder.imageName.setText(mImageNames.get(position));

    holder.parentLayout.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {




            Log.d(TAG, "onClick: clicked on: " +mImageNames.get(position));
            Log.d(TAG, "onClick: clicked on: " +mImageNames.size());

switch  (mImageNames.get(position)){

    case "Introduction":
        Intent Introduction = new Intent(mContext, Introduction.class );
        mContext.startActivity(Introduction);

        break;
    case "Roles":
        Intent Roles = new Intent(mContext, Roles.class );
        mContext.startActivity(Roles);
        break;
    case "Ceremomnies":
        Intent Ceremonies = new Intent(mContext, Ceremonies.class );
        mContext.startActivity(Ceremonies);
        break;
    case "Artifacts":
        Intent Artifacts = new Intent(mContext, Artifacts.class );
        mContext.startActivity(Artifacts);
        break;
}



        }
    });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

}
