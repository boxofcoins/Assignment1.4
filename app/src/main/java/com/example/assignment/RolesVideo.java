package com.example.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import org.w3c.dom.Text;

public class RolesVideo extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button playBtn;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_lectures);

        playBtn = findViewById(R.id.playerButton);
        youTubePlayerView = findViewById(R.id.youtubePlayer);


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


youTubePlayer.loadVideo("kmRfBl3p6PA");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        playBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        youTubePlayerView.initialize(YoutubeConfig.getApiKey(),onInitializedListener);

    }
});
    }
}
