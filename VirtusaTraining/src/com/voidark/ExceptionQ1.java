package com.voidark;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;

public class ExceptionQ1 {

    public static void main(String[] args) {
	// write your code here
        try{
            badMethod();
            System.out.println("A");
        }
        catch(Error e){
            System.out.println("B");
        }
        finally{
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){
        throw new Error();
    }
}
