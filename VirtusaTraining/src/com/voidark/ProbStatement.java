package com.voidark;

import java.util.Scanner;

public class ProbStatement {
    static int liters;
    static int distance;
    void askInput(){
        Scanner scan = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Enter num liters to fill the tank.");
                liters = scan.nextInt();
                System.out.println("Enter the distance covered");
                distance = scan.nextInt();
                if(liters<=0 || distance <=0){
                    throw new Exception();
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Please Enter correct value");
            }
        }
    }
    void literperkm(int liters,int distance){
        float fuelconsumptionKM = (liters*100)/(distance);
        System.out.println(String.format("Liters/100KM = %.2f",fuelconsumptionKM));
    }
    void milespergallon(int liters,int distance){
        double dist = distance * 0.6214;
        double gallons = liters*0.2642;
        double fuelconsumptionKM = (dist/gallons);
        System.out.println(String.format("miles/gallons = %.2f",fuelconsumptionKM));
    }

    public static void main(String[] args) {
        ProbStatement obj = new ProbStatement();
        obj.askInput();
        obj.literperkm(liters,distance);
        obj.milespergallon(liters,distance);
    }
}
