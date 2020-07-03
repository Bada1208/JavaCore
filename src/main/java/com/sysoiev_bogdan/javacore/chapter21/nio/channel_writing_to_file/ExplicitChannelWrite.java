package com.sysoiev_bogdan.javacore.chapter21.nio.channel_writing_to_file;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter21\\nio\\channel_writing_to_file\\test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();
            fileChannel.write(buffer);

        } catch (InvalidPathException | IOException e) {
            System.out.println(e);
        }
    }
}
