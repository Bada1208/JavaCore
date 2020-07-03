package com.sysoiev_bogdan.javacore.chapter21.nio.channel_reading_from_file;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;
        //сначала получить путь к файлу
        try {
            filePath = Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter21\\nio\\channel_reading_from_file\\text.txt");
        } catch (InvalidPathException e) {
            System.out.println(e);
            return;
        }
        //затем получить канал к этому файлу в Олоке оператора try с ресурсам
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(filePath)) {
            //выделить память под буфер
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                //читать данные из файла в буфер
                count = seekableByteChannel.read(buffer);
                //прекратить чтение по достижении конца файла
                if (count != -1) {
                    //подготовить Оуфер к чтению из него данны
                    buffer.rewind();
                    //читать Оайты данных из Оуфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
