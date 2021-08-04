package com.voidark;

public class ConstructorCall {
    ConstructorCall(){
        System.out.println("i am inside constructor");
    }
    ConstructorCall(int a){
        System.out.println("i am inside constructor 2");
    }
    public static void main(String[] args) {
        System.out.println("i am here");
        ConstructorCall obj = new ConstructorCall(6);
        System.out.println(obj);
    }
}
