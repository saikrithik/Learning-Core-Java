package com.voidark;

import java.awt.*;
import java.awt.event.*;
class Awt_Event1 extends Frame implements ActionListener{
    TextField tf,tf2;
    Awt_Event1(){
//create components
        tf=new TextField();
        tf2 = new TextField();
        tf2.setBounds(60,80,170,20);
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        Button b2=new Button("click me2");
        b2.setBounds(120,150,80,30);
//register listener
        b2.addActionListener(this);
        b.addActionListener(this);//passing current instance

//add components and set size, layout and visibility
        add(b);add(tf);add(tf2);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
        tf2.setText("Krithik");
    }
    public static void main(String args[]){
        new Awt_Event1();
    }
}