package com.voidark;

public class compilererrorTest {
    public static void main(String[] args) {
        try{
            int a[] = {1,2,3,4};
            for (int i =1; i<=4; i++){
                System.out.println(a[i]);
            }

            }
        catch(Exception e){
            System.out.println(e);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("arrayerror");
//        }

    }

}
