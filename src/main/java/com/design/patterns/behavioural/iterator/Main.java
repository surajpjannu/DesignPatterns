package com.design.patterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {

        DiscJockey discJockey = new DiscJockey(
                new SongOf70s(), new SongOf80s(), new SongOf90s()
        );
        discJockey.showTheSongs();
    }
}
