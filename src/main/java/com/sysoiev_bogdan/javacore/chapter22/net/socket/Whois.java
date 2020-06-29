package com.sysoiev_bogdan.javacore.chapter22.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int с;

        Socket s = new Socket("whois.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        // сформировать строку запроса
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]);
        // преобразовать строку в Сайты
        byte buf[] = str.getBytes();
        // послать запрос
        out.write(buf);
        // прочитать ответ и вывести его на экран
        while ((с = in.read()) != -1) {
            System.out.print((char) с);
        }
        s.close();
    }
}
