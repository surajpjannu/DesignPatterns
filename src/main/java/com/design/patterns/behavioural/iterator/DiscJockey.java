package com.design.patterns.behavioural.iterator;

import java.util.Iterator;

public class DiscJockey {
    SongOf70s songOf70s;
    SongOf80s songOf80s;
    SongOf90s songOf90s;

    public DiscJockey(SongOf70s songOf70s, SongOf80s songOf80s, SongOf90s songOf90s) {
        this.songOf70s = songOf70s;
        this.songOf80s = songOf80s;
        this.songOf90s = songOf90s;
    }

    public void showTheSongs() {
        Iterator<SongInfo> songs70 = songOf70s.getSongs();
        Iterator<SongInfo> songs80 = songOf80s.getSongs();
        Iterator<SongInfo> songs90 = songOf90s.getSongs();
        System.out.println("====== 70s =============");
        displaySongs(songs70);

        System.out.println("====== 80s =============");
        displaySongs(songs80);

        System.out.println("====== 90s =============");
        displaySongs(songs90);
    }

    private void displaySongs(Iterator<SongInfo> songs) {
        while (songs.hasNext()) {
            SongInfo next = songs.next();
            System.out.print("SongName : " + next.getSongName());
            System.out.print(" bandName : " + next.getBandName());
            System.out.print(" year : " + next.getYearReleased());
            System.out.println();
        }
    }
}
