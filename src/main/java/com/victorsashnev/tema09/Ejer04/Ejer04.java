package com.victorsashnev.tema09.Ejer04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer04 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer04(){
        int numb;

        int[] aray = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                try {
                    numb = Integer.parseInt(scanner.nextLine());
                    aray[i] =numb;
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                }
            }
        }catch(IndexOutOfBoundsException ioobe){
            System.out.println(" El aray esta fuera de espacio ");
        }
        System.out.println(Arrays.toString(aray));
        try{
            int arayTwo[];
        } catch(IllegalStateException ise){
            System.out.println("El array no esta iniciaizado");
        }

    }
}
