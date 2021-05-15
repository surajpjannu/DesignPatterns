package com.design.patterns.behavioural.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongOf80s implements SongsIterator {

    SongInfo[] songs = new SongInfo[4];

    public SongOf80s() {
        songs[0] = new SongInfo("1981", "1981", 1981);
        songs[1] = new SongInfo("1982", "1982", 1982);
        songs[2] = new SongInfo("1983", "1983", 1983);
        songs[3] = new SongInfo("1984", "1984", 1984);
    }

//    public SongInfo[] getSongs() {
//        return songs;
//    }


    @Override
    public Iterator<SongInfo> getSongs() {
        return Arrays.asList(songs).iterator();
    }
}
