package com.voidark;

import java.awt.*;
class Awt_Frame1 extends Frame{
    Awt_Frame1(){
            Button b=new Button("click me");
            b.setBounds(100,150,150,30);// setting button position
            add(b);//adding button into frame
            setSize(500,500);//frame size 300 width and 300 height
            setLayout(null);//no layout manager
            setVisible(true);//now frame will be visible, by default not visible
        }
        public static void main(String args[]){
            new Awt_Frame1();
        }}