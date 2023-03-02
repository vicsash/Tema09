package com.victorsashnev.tema09.Ejer04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer04 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer04(){

        int[] aray = new int[5];
        System.out.println("introduce number until no able to");
        aray = makeAray(aray);

        System.out.println(Arrays.toString(aray));
        int arayTwo[]=null;
        try{
            System.out.println(arayTwo);
        } catch(NullPointerException ise){
            System.out.println("El array no esta iniciaizado");
        }

    }

    /**
     * Method to make array
     * @param aray recieves empty array
     * @return ""full" aray
     */
    public int[] makeAray(int [] aray){
        int numb;
        try {
            for (int i = 0; i < 6; i++) {
                try {
                    numb = Integer.parseInt(scanner.nextLine());
                    aray[i] =numb;
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ioobe){
            System.out.println(" El aray esta fuera de espacio ");
        }
        return aray;
    }
}
