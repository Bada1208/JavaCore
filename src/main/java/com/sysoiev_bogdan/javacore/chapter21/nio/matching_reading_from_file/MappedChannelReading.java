package com.sysoiev_bogdan.javacore.chapter21.nio.matching_reading_from_file;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelReading {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter21\\nio\\matching_reading_from_file\\test.txt"))) {
            long fileSize = fileChannel.size();
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);
            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) mappedByteBuffer.get());
            }
            System.out.println();
        } catch (InvalidPathException | IOException e) {
            System.out.println(e);
        }
    }
}
