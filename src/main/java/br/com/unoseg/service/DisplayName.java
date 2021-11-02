package br.com.unoseg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DisplayName {
    private String nameDisplay;
    private int number;

    public DisplayName(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public void converter(String nameDisplay){
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
        final String seis = "   " +
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
        numeros = Arrays.asList(um,dois,tres,quatro,cinco,seis,sete,oito,nove);

        int coluna = 0;
        int digito = 0;
        String[] d = {"","","","","","","","",""};
        String[] objQ = nameDisplay.split("");
        System.out.println(objQ.length);

        for (int i = 0; i < objQ.length; i++) {
            if (coluna <= 1){
                if (digito > 8){
                    System.out.println();
                    digito = 0;
                    System.out.print(i+" <-"+digito+"G ");
                    d[digito] += objQ[i];
                }else {
                    System.out.print(i+" <-"+digito+"G ");
                    d[digito] += objQ[i];
                }
                coluna ++;
            }else {
                if (digito > 8){
                    digito = 0;
                }
                System.out.print(i+" <-"+digito+"G ");
                d[digito] += objQ[i];
                coluna = 0;
                digito ++;

            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("Digito "+ i+1+":");
            for (String numero : numeros){
                if(d[i].equals(numero)){
                    System.out.println(numero);
                }
            }
        }
    }

    public static void main(String[] args) {

        String obNumber = "   " + " _ " + " _ " + "   " + " _ " + " _ " + " _ " + " _ " + " _ " +
                "  |" + " _|" + " _|" + "|_|" + "|_ " + "|_ " + "  |" + "|_|" + "|_|" +
                "  |" + "|_ " + " _|" + "  |" + " _|" + "|_|" + "  |" + "|_|" + "  |" +
                "                           ";
    }
}
