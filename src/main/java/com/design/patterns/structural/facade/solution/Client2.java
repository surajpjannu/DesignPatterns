package com.design.patterns.structural.facade.solution;

public class Client2 {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convertVideo("youtubevideo.mp4", "mp4");
    }
}