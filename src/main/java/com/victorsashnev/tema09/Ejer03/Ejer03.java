package com.victorsashnev.tema09.Ejer03;

import java.util.Scanner;

public class Ejer03 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer03(){
        int numb = 0;
        int aux = Integer.MIN_VALUE;
        boolean work = true;
        int extNumber;
        int counter = 0;

        do{
            System.out.println("Introduce numero");
            try{
                numb = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException nfe) {
                if(counter == 0){
                    System.out.println("Hay que empezar con un numero");
                    work = false;
                }
                if(counter > 0){
                    System.out.println("No es un numero");
                    work = false;
                }

            }
            extNumber = largerNumber( numb, aux);
            aux = numb;
            counter ++;
        }while(work);
        System.out.println(extNumber);
    }

    public int largerNumber(int one, int two){
        return Math.max(one, two);
    }
}
