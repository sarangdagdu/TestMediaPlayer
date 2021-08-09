package com.example.android.testmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;
    Button playButton;
    Button pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.dubstep);
        playButton = findViewById(R.id.play_button);
        pauseButton = findViewById(R.id.pause_button);
        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.play_button) {
            mediaPlayer.start();

        } else if (v.getId() == R.id.pause_button) {
            mediaPlayer.pause();
        }
    }
}