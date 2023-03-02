package com.victorsashnev.tema09.Ejer05;

import java.util.Scanner;

public class Ejer05 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer05(){

        int counter = 0;
        int student = 0;
        Alumno[] alumno = new Alumno[2];
        String nombre;
        int edad = 0,altura = 0;
        int pos,prim,posAray = 0;
        int aux = Integer.MIN_VALUE;

        do {
            boolean work = false;
            nombre = scanner.nextLine();
            do {
                try {
                    edad = Integer.parseInt(scanner.nextLine());
                    work = true;
                    scanner.nextLine();
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                    System.out.println("Introduce");
                }

            } while (work);
            work = false;
            do{
                try {
                    altura = Integer.parseInt(scanner.nextLine());
                    work = true;
                    scanner.nextLine();
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                }
            }while(work);
            alumno[counter] =new Alumno(nombre,edad,altura);
            counter++;
        }while(counter < 2);

        for(int i =0; i< alumno.length;i++){
            System.out.println(alumno[i]);
        }

       for(int i =0; i< alumno.length;i++){
           pos=alumno[i].getEdad();
           if(pos > aux){
               aux = pos;
               posAray=i;
           }else{
               aux = pos;
               posAray =i;
           }
       }
        System.out.println(alumno[posAray]);
    }


}
