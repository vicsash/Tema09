package com.victorsashnev.tema09.Ejer05;

import java.util.Scanner;

public class Ejer05 {
    static Scanner scanner = new Scanner(System.in);
    Alumno[] alumno = new Alumno[2];
    public Ejer05(){

        int counter = 0;

        String nombre;
        int edad = 0,altura = 0;

        do {
            System.out.println("Nombre");
            boolean work = false;
            nombre = scanner.nextLine();
            do {
                System.out.println("Edad");
                try {
                    edad = Integer.parseInt(scanner.nextLine());
                    work = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                    System.out.println("Introduce");
                }

            } while (!work);
            work = false;
            do{
                System.out.println("Altura");
                try {
                    altura = Integer.parseInt(scanner.nextLine());
                    work = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("No es un numero");
                }
            }while(!work);
            alumno[counter] =new Alumno(nombre,edad,altura);
            counter++;
        }while(counter < 2);

        for(int i =0; i< alumno.length;i++){
            System.out.println(alumno[i]);
        }

        System.out.println("\n");
        System.out.println(alumno[oldestAge()]);
    }

    /**
     * Method to get the oldest of two students
     * @return position in aray
     */
    public int oldestAge(){
        int pos,prim,posAray = 0;
        int aux = Integer.MIN_VALUE;
        for(int i =0; i< alumno.length;i++){
            pos=alumno[i].getEdad();
            if(pos > aux){
                aux = pos;
                posAray=i;
            }
        }
        return  posAray;
    }
}
