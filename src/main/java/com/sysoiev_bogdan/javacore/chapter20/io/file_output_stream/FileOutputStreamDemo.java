package com.sysoiev_bogdan.javacore.chapter20.io.file_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "При выполнении нагрузок высокой интенсивности рано или поздно доставка кислорода к клеткам становится недостаточной. В результате этого клетки оказываются вынуждены получать энергию не только аэробным путём (окислительное фосфорилирование), но и с помощью анаэробного гликолиза. В норме образовавшиеся в ходе гликолиза НАДН*H+ передают протоны в электронтранспортную цепь митохондрий, но из-за недостатка кислорода они накапливаются в цитоплазме и тормозят гликолиз. Чтобы позволить гликолизу продолжаться, они начинают передавать протоны на пируват с образованием молочной кислоты. Молочная кислота в физиологических условиях диссоциирована на ион лактата и протон. Ионы лактата и протоны выходят из клеток в кровь. Протоны начинают забуфериваться бикарбонатной буферной системой с выделением избытка неметаболического СО2. При забуферивании происходит снижение уровня стандартных бикарбонатов плазмы крови.\n" +
                "\n" +
                "Величина анаэробного порога у активно тренированных спортсменов примерно равна 90 % от МПК.";
        byte[] buf = source.getBytes();
        try (FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_output_stream\\file1.txt");
             FileOutputStream fileOutputStream2 = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_output_stream\\file2.txt");
             FileOutputStream fileOutputStream3 = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_output_stream\\file3.txt")) {
            //write to the first file which will contain every second byte
            for (int i = 0; i < buf.length; i += 2) {
                fileOutputStream1.write(buf[i]);
            }
            //write to the second file which will contain all bytes
            fileOutputStream2.write(buf);

            //write to the third file which will contain last 1/4 part of bytes
            fileOutputStream3.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
