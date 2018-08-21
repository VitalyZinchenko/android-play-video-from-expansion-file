package com.example.playvideofromexpansionfile;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = findViewById(R.id.test_video_view);
        Button playVideoButton = findViewById(R.id.play_video_button);

        playVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri videoUri = Uri.withAppendedPath(SampleZipFileProvider.ASSET_URI, "grb_2.mp4");
                videoView.setVideoURI(videoUri);
                videoView.start();
            }
        });
    }
}
