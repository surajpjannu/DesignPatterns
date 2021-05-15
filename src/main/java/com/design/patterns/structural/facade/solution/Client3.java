package com.design.patterns.structural.facade.solution;

import com.design.patterns.structural.facade.solution.VideoConversionFacade;

public class Client3 {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convertVideo("youtubevideo.ogg", "ogg");
    }
}