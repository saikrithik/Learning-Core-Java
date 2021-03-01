package com.voidark;

public class ThreadExample3 extends Thread{

    public void run(){
        for(int i=0;i<=50;i++) {
            System.out.println("running thread name is:" + Thread.currentThread().getName() +" priority: "+Thread.currentThread().getPriority());
//            System.out.println("running thread priority is:" + );
        }
    }

    public static void main(String args[]){
        ThreadExample3 m1=new ThreadExample3();
        ThreadExample3 m2=new ThreadExample3();
//        Thread thread1 = new Thread(m1);
//        Thread thread2 = new Thread(m2);
        m1.setPriority(1);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
