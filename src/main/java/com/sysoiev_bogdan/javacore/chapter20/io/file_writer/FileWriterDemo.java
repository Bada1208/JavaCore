package com.sysoiev_bogdan.javacore.chapter20.io.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "ЭКЗИСТЕНЦИАЛИ́ЗМ\n" +
                "/тэ/\n" +
                "Мужской родКНИЖНОЕ\n" +
                "Иррационалистическое направление в современной философии и литературе, " +
                "ставящее в центр изучения и изображения человеческое существование и утверждающее " +
                "интуицию в качестве основного метода постижения действительности.";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        try (FileWriter fileWriter1 = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_writer\\file1.txt");
             FileWriter fileWriter2 = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_writer\\file2.txt");
             FileWriter fileWriter3 = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_writer\\file3.txt")) {
            for (int i = 0; i < buffer.length; i += 2) {
                fileWriter1.write(buffer[i]);
            }

            fileWriter2.write(buffer);

            fileWriter3.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
