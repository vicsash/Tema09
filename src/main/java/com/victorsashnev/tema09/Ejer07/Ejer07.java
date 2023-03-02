package com.victorsashnev.tema09.Ejer07;

import com.victorsashnev.tema09.Ejer03.Ejer03;

public class Ejer07 {
    public Ejer07(){

        String [] thred={"pop","lop","hop","job", null,"wop"};
        System.out.println(firstLetter(thred));
    }

    /**
     * First letter
     * @param aray
     * @return
     */
    public String firstLetter( String [] aray){
        char pos=' ';
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i<aray.length;i++){
            try {
                 pos = aray[i].charAt(0);
            }catch (NullPointerException npe){
                System.out.println("danger there is null in array");
            }
            sb.append(pos).append("\n");
        }
        return sb.toString();
    }
}
