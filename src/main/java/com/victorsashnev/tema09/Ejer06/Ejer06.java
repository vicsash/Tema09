package com.victorsashnev.tema09.Ejer06;

import java.util.Scanner;

public class Ejer06 {
    static Scanner scanner = new Scanner(System.in);
    public Ejer06(){
        int[] aray = {10,20,30,40,50,60,70};
        int div=0;
        double[] arayTwo = {-2,-1,0,1,2};
        double newDiv =2;

        System.out.println("Numero para dividir");
        try{
            div = scanInt();
        }catch (NoNumberException nne){
            System.err.println(nne.getMessage());
        }

        System.out.println(divShow(aray,div));
        System.out.println(divShowDouble(arayTwo,newDiv));
    }

    public int scanInt() throws NoNumberException{
        boolean work = false;
        int toReturn;
        do {
             toReturn = Integer.parseInt(scanner.nextLine());
            if (toReturn == 0)
                throw new NoNumberException("The number cannot be zero");
            else
                work =true;
        }while(!work);
        return toReturn;
    }

    /**
     * Divide aray by a number
     * @param aray
     * @param div
     * @return result of division
     */
    public String divShow(int[] aray, int div){
        int numb =0;
        StringBuilder sb =new StringBuilder();
        for(int i =0; i < aray.length; i++){
            try {
                numb = aray[i] / div;
            }catch (ArithmeticException ae){
                System.out.println("You cant divide by zero");
                break;
                //numb=0;
            }
            sb.append(numb).append("\n");
        }
        return sb.toString();
    }
    /**
     * Divide aray by a number
     * @param aray
     * @param div
     * @return result of division
     */
    public String divShowDouble(double[] aray, double div){
        double numb =0;
        StringBuilder sb =new StringBuilder();
        for(int i =0; i < aray.length; i++){
            try {
                numb = aray[i] / div;
            }catch (ArithmeticException ae){
                System.out.println("You cant divide by zero");
                break;
                //numb=0;
            }
            sb.append(numb).append("\n");
        }
        return sb.toString();
    }
}
