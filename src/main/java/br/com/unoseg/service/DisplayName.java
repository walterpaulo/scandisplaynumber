package br.com.unoseg.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DisplayName {
    private String nameDisplay;

    public DisplayName(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public static String converter(String nameDisplay){
        final String um = "   " +
                "  |" +
                "  |" +
                "   ";
        final String dois = " _ " +
                " _|" +
                "|_ " +
                "   ";
        final String tres = " _ " +
                " _|" +
                " _|" +
                "   ";
        final String quatro = "   " +
                "|_|" +
                "  |" +
                "   ";
        final String cinco = " _ " +
                "|_ " +
                " _|" +
                "   ";
        final String seis = " _ " +
                "|_ " +
                "|_|" +
                "   ";
        final String sete = " _ " +
                "  |" +
                "  |" +
                "   ";
        final String oito = " _ " +
                "|_|" +
                "|_|" +
                "   ";
        final String nove = " _ " +
                "|_|" +
                " _|" +
                "   ";
        final String zero = " _ " +
                "| |" +
                "|_|" +
                "   ";
        List<String> numeros = new ArrayList<>();
        numeros = Arrays.asList(zero,um,dois,tres,quatro,cinco,seis,sete,oito,nove);
        String number = "";
        String[] d = {"","","","","","","","",""};
        String[] objQ = nameDisplay.split("");
//        System.out.println(objQ.length);
        int coluna = 0;
        int digito = 0;

        for (int i = 0; i < objQ.length; i++) {
            if (coluna <= 1){
                if (digito > 8){
                    System.out.println();
                    digito = 0;
//                  System.out.print(i+" <-"+digito+"G ");
                    d[digito] += objQ[i];
                }else {
//                  System.out.print(i+" <-"+digito+"G ");
                    d[digito] += objQ[i];
                }
                coluna ++;
            }else {
                if (digito > 8){
                    digito = 0;
                }
//              System.out.print(i+" <-"+digito+"G ");
                d[digito] += objQ[i];
                coluna = 0;
                digito ++;
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < numeros.size(); j++){
                int oi =j;
                if(d[i].equals(numeros.get(j))){
                    number += j;
                }
            }

        }
   return number;
    }

    public static void main(String[] args) {
        String obNumber = " _ " + " _ " + " _ " + "   " + " _ " + " _ " + " _ " + " _ " + " _ " +
                "| |" + " _|" + " _|" + "|_|" + "|_ " + "|_ " + "  |" + "|_|" + "|_|" +
                "|_|" + "|_ " + " _|" + "  |" + " _|" + "|_|" + "  |" + "|_|" + " _|" +
                "                           ";

        String teste1 = " _ " + " _ " + " _ " + "   " + "   " + " _ " + " _ " + " _ " + "   " +
                        "|_|" + "|_|" + " _|" + "|_|" + "|_|" + "  |" + "|_ " + "  |" + "|_|" +
                        " _|" + " _|" + " _|" + "  |" + "  |" + "  |" + "|_|" + "  |" + "  |" +
                       "                           ";
        System.out.println(converter(obNumber));
        System.out.println(converter(teste1));
    }
}
