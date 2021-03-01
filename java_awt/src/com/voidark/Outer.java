package com.voidark;

import java.awt.event.*;
class Outer implements ActionListener{
    Awt_Event2 obj;
    Outer(Awt_Event2 obj){
        this.obj=obj; }

    public void actionPerformed(ActionEvent e){
        obj.tf.setText("welcome hey");
        obj.tf2.setText("Krithik");
    }
}
