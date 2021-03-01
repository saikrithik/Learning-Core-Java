package com.voidark;
public class AccessModifiers {
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.mymethod2();
        TestStatic.mymethod3();
    }
    protected void mymethod4(){
        System.out.println("Krithik");
    }
}

class myclass{
    protected void mymethod(){
        System.out.println("Krithik");
    }
    public void mymethod2(){
        mymethod();
    }

}
