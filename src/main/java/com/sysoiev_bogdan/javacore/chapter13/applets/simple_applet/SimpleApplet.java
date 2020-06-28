package com.sysoiev_bogdan.javacore.chapter13.applets.simple_applet;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
public class SimpleApplet extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawString("Ordinary applet", 20, 20);
    }
}
