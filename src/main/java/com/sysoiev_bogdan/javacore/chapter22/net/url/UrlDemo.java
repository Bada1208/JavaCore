package com.sysoiev_bogdan.javacore.chapter22.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.idoportal.com/blog");
        System.out.println("Пpoтoкoл : " + url.getProtocol());
        System.out.println("Пopт : " + url.getPort());
        System.out.println("Xocт : " + url.getHost());
        System.out.println("Фaйл :" + url.getFile());
        System.out.println("Пoлнaя форма : " + url.toExternalForm());
    }
}
