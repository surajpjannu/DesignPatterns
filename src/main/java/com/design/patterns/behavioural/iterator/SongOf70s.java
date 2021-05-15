package com.design.patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongOf70s implements SongsIterator {

    ArrayList<SongInfo> songs = new ArrayList<>();

    public SongOf70s(){
        songs.add(new SongInfo("1971","1971",1971));
        songs.add(new SongInfo("1972","1972",1972));
        songs.add(new SongInfo("1973","1973",1973));
        songs.add(new SongInfo("1974","1974",1974));
    }

//    public ArrayList<SongInfo> getSongs() {
//        return songs;
//    }

    @Override
    public Iterator<SongInfo> getSongs(){
        return songs.iterator();
    }
}
