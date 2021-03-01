package com.voidark;
import java.awt.*;
import java.awt.event.*;
public class Awt_Label extends Frame implements ActionListener{
    Label l; Button b;
    Awt_Label(){
        l = new Label();
        l.setBounds(50,100, 250,20);
        l.setText("Krithik");
        b=new Button("Click me");
        b.setBounds(50,150,60,30);
        b.addActionListener(this);
        add(b);add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
            l.setText("Krithika");
    }
    public static void main(String[] args) {
        new Awt_Label();
    }
}