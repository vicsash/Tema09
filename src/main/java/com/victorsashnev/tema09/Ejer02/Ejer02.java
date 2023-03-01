package com.victorsashnev.tema09.Ejer02;

import java.util.Scanner;

public class Ejer02 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer02(){

        int counter = 0;
        int exept = 0;
        double numb = 0;
        double aux = Double.MIN_VALUE;

        do {
            try{
           numb = inroNum(exept);
           counter++;
            }catch(NumberFormatException noe){
                System.out.println("Introduce numbers only");
                exept++;
            }
            System.out.println(largerNumber(numb,aux));
        }while(counter < 10);

    }
    public double inroNum( int exept){
        double dec;
        dec = Double.parseDouble(scanner.nextLine());
        return dec;
    }

    public double largerNumber(double one, double two){
        if(one>two)
            return one;
        return two;
    }
}
