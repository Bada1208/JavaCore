package com.sysoiev_bogdan.javacore.chapter20.io.serialization;

import java.io.Serializable;

public class MyClass implements Serializable {
    transient String s;
    transient int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return " s=" + s + "; i=" + i + "; d=" + d;
    }
}
