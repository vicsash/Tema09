package com.victorsashnev.tema09.Ejer01;

import java.util.Scanner;

public class Ejer01 {
    public static Scanner sc = new Scanner(System.in);

    public Ejer01(){
        int num;
        boolean work = true;
            do {
                num = numberRead();

                if(num > 0) {
                    work = true;
                }else
                   work = false;
            } while (work != false);
    }

    public int numberRead(){
        int num;
        try {
            num = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException nfe){
            System.out.println("A number must be introduced");
            return -1;
        }
        return num;
    }
}
