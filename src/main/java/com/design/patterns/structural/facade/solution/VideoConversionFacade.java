package com.design.patterns.structural.facade.solution;

import com.design.patterns.structural.facade.solution.model.Codec;
import com.design.patterns.structural.facade.solution.model.MPEG4CompressionCodec;
import com.design.patterns.structural.facade.solution.model.OggCompressionCodec;
import com.design.patterns.structural.facade.solution.systems.AudioMixer;
import com.design.patterns.structural.facade.solution.systems.BitrateReader;
import com.design.patterns.structural.facade.solution.systems.CodecFactory;
import com.design.patterns.structural.facade.solution.systems.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
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