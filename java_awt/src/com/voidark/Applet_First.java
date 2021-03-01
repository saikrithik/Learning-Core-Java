package com.voidark;

import java.applet.Applet;
import java.awt.Graphics;
public class Applet_First extends Applet{
    public void paint(Graphics g){
        String str=getParameter("msg");

        g.drawString(str,150,150);
    }
}

/*
<applet code="Applet_First.class" width="300" height="300">
<param name="msg" value="Welcome to applet">
</applet>
*/
