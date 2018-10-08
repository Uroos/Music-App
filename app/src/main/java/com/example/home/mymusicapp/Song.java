package com.example.home.mymusicapp;

/**
 * Created by Home on 11/10/2017.
 */

public class Song {
    private String song;
    private String artist;

    public Song (String mSong, String mArtist){
        song=mSong;
        artist=mArtist;
    }

    public String getSong(){ return song; }

    public String getArtist(){ return artist; }
}
