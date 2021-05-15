package com.design.patterns.structural.facade.problems.systems;

import com.design.patterns.structural.facade.problems.model.Codec;
import com.design.patterns.structural.facade.problems.model.MPEG4CompressionCodec;
import com.design.patterns.structural.facade.problems.model.OggCompressionCodec;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}