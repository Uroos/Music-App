package com.example.home.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        /**
         * Here we are setting up a listener for the button to take us to Albums activity.
         */
        Button b = findViewById(R.id.songs_back_button);
        b.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(bIntent);
            }
        });

        /**
         * We need to create our own class to store the song along with its
         * artist so both are grouped together in one song item.
         */
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Song one", "Artist one"));
        songs.add(new Song("Song two", "Artist two"));
        songs.add(new Song("Song three", "Artist three"));
        songs.add(new Song("Song four", "Artist four"));
        songs.add(new Song("Song five", "Artist five"));
        songs.add(new Song("Song six", "Artist six"));
        songs.add(new Song("Song seven", "Artist seven"));
        songs.add(new Song("Song eight", "Artist eight"));
        songs.add(new Song("Song nine", "Artist nine"));
        songs.add(new Song("Song ten", "Artist ten"));
        songs.add(new Song("Song eleven", "Artist eleven"));
        songs.add(new Song("Song twelve", "Artist twelve"));
        songs.add(new Song("Song thirteen", "Artist thirteen"));
        songs.add(new Song("Song fourteen", "Artist fourteen"));
        songs.add(new Song("Song fifteen", "Artist fifteen"));
        songs.add(new Song("Song sixteen", "Artist sixteen"));
        songs.add(new Song("Song seventeen", "Artist seventeen"));
        songs.add(new Song("Song eighteen", "Artist eighteen"));
        songs.add(new Song("Song nineteen", "Artist nineteen"));
        songs.add(new Song("Song twenty", "Artist twenty"));


        /**
         * Objects of any type besides the String cannot be passed to ArrayAdapter. Therefore
         * we need to create a custom ArrayAdapter that will take an object of our type and
         * display it properly.
         */
        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs_list);

        listView.setAdapter(itemsAdapter);
    }
}
