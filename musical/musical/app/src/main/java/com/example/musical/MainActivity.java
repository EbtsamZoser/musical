package com.example.musical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    ImageView play;
    ImageView pause;
    ImageButton skipNext;
    ImageButton skipPrevious;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //seekBar
        seekBar= (SeekBar)findViewById(R.id.seek);
        int seekBarValue= seekBar.getProgress();

        play = (ImageView) findViewById(R.id.play);
        pause = (ImageView) findViewById(R.id.pause);
        skipNext = (ImageButton)findViewById(R.id.skip_next);
        skipPrevious = (ImageButton)findViewById(R.id.skip_previous);

        button = (Button)findViewById(R.id.albums);
        //button to open albums activity
        button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent nowIsPlayingIntent = new Intent(getBaseContext(), AlbumsActivity.class);
               startActivity(nowIsPlayingIntent);
            }
        });
        // media player button
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "play the song", Toast.LENGTH_SHORT).show();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pause the song", Toast.LENGTH_SHORT).show();
            }
        });
        skipPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "skip previous song", Toast.LENGTH_SHORT).show();
            }
        });
        skipNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "skip next song", Toast.LENGTH_SHORT).show();
            }
        });
}}
