package com.victorsashnev.tema09.Ejer08;

import com.victorsashnev.tema09.Ejer06.NoNumberException;

import java.util.Scanner;

public class Ejer08 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer08(){

        int [] aray =new int [5];
        int ten = 10;
        String [] thrd = null;


        for(int i = 0 ; i < 6; i++){
            try {
                aray[i] = Integer.parseInt(scanner.nextLine());
            }catch (ArrayIndexOutOfBoundsException aioobe){
                System.out.println("Out of bounds");
            }
        }
        System.out.println("Introduce a number to dive 10 by");
        int numb = Integer.parseInt(scanner.nextLine());
        try {
            int reslt = 10 / numb;
        }catch (ArithmeticException ae){
            System.out.println("you cannot divede by zero");
        }

        try{
            thrd[2]="pop";
        } catch(NullPointerException ise){
            System.out.println("El array no esta iniciaizado");
        }

    }
}
