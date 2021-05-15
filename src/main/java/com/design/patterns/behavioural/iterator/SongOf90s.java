package com.design.patterns.behavioural.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongOf90s implements SongsIterator {

    Hashtable<Integer, SongInfo> songs = new Hashtable<>();

    public SongOf90s() {
        SongInfo songs0 = new SongInfo("1991", "1991", 1991);
        SongInfo songs1 = new SongInfo("1992", "1992", 1992);
        SongInfo songs2 = new SongInfo("1993", "1993", 1993);
        SongInfo songs3 = new SongInfo("1994", "1994", 1994);

        songs.put(0, songs0);
        songs.put(1, songs1);
        songs.put(2, songs2);
        songs.put(3, songs3);
    }

//    public Hashtable<Integer, SongInfo> getSongs() {
//        return songs;
//    }

    @Override
    public Iterator<SongInfo> getSongs() {
        return songs.values().iterator();
    }
}
