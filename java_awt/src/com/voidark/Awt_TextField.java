package com.voidark;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class Awt_TextField extends Frame implements ActionListener{
    TextField tf1,tf2,tf3;
    Button b1,b2;
    Awt_TextField(){
        b1 = new Button("+");
        b1.setBounds(75,150,50,20);
        b2 = new Button("-");
        b2.setBounds(150,150,70,20);

        tf1 = new TextField();
        tf1.setBounds(100,40,75,30);
        tf2 = new TextField();
        tf2.setBounds(100,80,75,30);
        tf3 = new TextField();
        tf3.setBounds(100,120,75,30);
        tf3.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c=0;
        if(e.getSource()==b1) { c = a + b; }
        else if(e.getSource()==b2){ c = a - b; }
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new Awt_TextField();
    }
}
