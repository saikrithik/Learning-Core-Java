package com.voidark;

import java.awt.*;
import java.awt.event.*;
public class Awt_MouseMotionListener extends Frame implements MouseMotionListener{
    Label l;
    Awt_MouseMotionListener(){
        addMouseMotionListener(this);
        l = new Label();
        l.setBounds(150,150,50,30);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),10,10);
        l.setText("Dragged");
    }
    public void mouseMoved(MouseEvent e) {
        l.setText("Moved");
    }

    public static void main(String[] args) {
        new Awt_MouseMotionListener();
    }
}