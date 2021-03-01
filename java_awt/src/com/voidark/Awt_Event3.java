package com.voidark;

import java.awt.*;
import java.awt.event.*;
class Awt_Event3 extends Frame{
    TextField tf;
    Awt_Event3(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(50,120,80,30);
        Button b2=new Button("click me");
        b2.setBounds(50,150,80,30);

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tf.setText("hello");
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tf.setText("hello Krithik");
            }
        });
        add(b);add(tf);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new Awt_Event3();
    }
}
