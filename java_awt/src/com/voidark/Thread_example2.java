package com.voidark;

public class Thread_example2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=5;i++){System.out.println("this is a working thread");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shit() throws InterruptedException{

    }

    public static void main(String[] args) throws InterruptedException {
        Thread_example2 my_obj= new Thread_example2();
        Thread t1 = new Thread(my_obj);
        t1.start();
        for(int i=0;i<=5;i++){System.out.println("this is a main thread");
        Thread.sleep(100);}
    }
}
