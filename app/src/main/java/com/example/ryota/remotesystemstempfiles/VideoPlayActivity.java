package com.example.ryota.remotesystemstempfiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class VideoPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_play);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String videoName = intent.getStringExtra("text");

        textView.setText(videoName);
    }
}
