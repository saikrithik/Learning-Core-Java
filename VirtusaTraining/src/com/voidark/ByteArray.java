package com.voidark;
import java.io.FileOutputStream;
public class ByteArray {
    public static void main(String[] args) {

        try {
            String s = "welcome home";
            FileOutputStream fout = new FileOutputStream("C:\\Users\\SaiKrithik\\IdeaProjects\\VirtusaTraining\\text.txt");
            byte b[] = s.getBytes();
            int i=0;
//            while(i!=10){
//                System.out.println(b[i]);
//                i++;
//            }
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
