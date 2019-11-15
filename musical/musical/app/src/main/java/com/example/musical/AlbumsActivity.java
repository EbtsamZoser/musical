package com.example.musical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<Albums> albums = new ArrayList<Albums>();
        albums.add(new Albums("Julio Iglesias", "When I Need You", R.drawable.images));
        albums.add(new Albums("Yanni", "world dance", R.drawable.download_2));
        albums.add(new Albums("Kenny g", "forever in love", R.drawable.image_1));
        albums.add(new Albums("Kenny Rogers", "Lady", R.drawable.image_2));
        albums.add(new Albums("Jennifer Lopez", "If You Had My Love", R.drawable.image_3));

        button = (Button) findViewById(R.id.now_playing);
        //button to open main activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        MyListAdapter albumsA = new MyListAdapter(this, albums);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumsA);
    }
}