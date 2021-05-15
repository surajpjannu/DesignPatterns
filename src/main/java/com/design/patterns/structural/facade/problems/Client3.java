package com.design.patterns.structural.facade.problems;

import com.design.patterns.structural.facade.problems.model.Codec;
import com.design.patterns.structural.facade.problems.model.MPEG4CompressionCodec;
import com.design.patterns.structural.facade.problems.model.OggCompressionCodec;
import com.design.patterns.structural.facade.problems.systems.AudioMixer;
import com.design.patterns.structural.facade.problems.systems.BitrateReader;
import com.design.patterns.structural.facade.problems.systems.CodecFactory;
import com.design.patterns.structural.facade.problems.systems.VideoFile;

import java.io.File;

public class Client3 {
    public static void main(String[] args) {
        convertVideo("youtubevideo.ogg", "mp4");
    }
    public static File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
