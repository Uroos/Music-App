package com.example.home.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        /**
         * Here we are setting up a listener for the button to take us to Albums activity.
         */
        Button b = findViewById(R.id.albums_back_button);
        b.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bIntent = new Intent(AlbumsActivity.this, StoreActivity.class);
                startActivity(bIntent);
            }
        });
    }
}
