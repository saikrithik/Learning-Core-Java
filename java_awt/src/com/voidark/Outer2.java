package com.voidark;

import java.awt.event.*;
class Outer2 implements ActionListener{
    Awt_Event2 obj;
    Outer2(Awt_Event2 obj){
        this.obj=obj; }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome Hey");
        obj.tf2.setText("Pratyusha");
    }
}
