package com.victorsashnev.tema09.intoduc;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = readInteger("Dame un numero");
    }
    public static int readInteger(String text){
        boolean valid;
        int  num =0;
        do {

            System.out.println(text);
            try {
                num = Integer.parseInt(scanner.nextLine());
                valid = true;
            }catch(NumberFormatException nfe){
                valid = false;
                pause("Solo numeros por favor");
            }
        }while (!valid);
        return num;
    }
    public static void pause(String text){
        System.out.println(text);
        System.out.println("Pulsa INTRO para continuar.....");
        scanner.nextLine();
    }
}
