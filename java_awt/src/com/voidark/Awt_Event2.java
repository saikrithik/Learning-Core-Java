package com.voidark;
import java.awt.*;
import java.awt.event.*;
class Awt_Event2 extends Frame{

    TextField tf,tf2;
    Awt_Event2(){
//create components
        tf=new TextField();
        tf2 = new TextField();
        tf2.setBounds(60,80,170,20);
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        Button b2=new Button("click me2");
        b2.setBounds(100,150,80,30);
//register listener
        Outer o=new Outer(this);
        b.addActionListener(o);//passing outer class instance
        Outer2 o2=new Outer2(this);
        b2.addActionListener(o2);//passing outer class instance
//add components and set size, layout and visibility
        add(b);add(tf);add(tf2);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new Awt_Event2();
    }
}
