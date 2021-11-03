package br.com.unoseg.service;

import java.util.ArrayList;
import java.util.Arrays;
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

    public String getconverter(){
        String number = "";
        String[] d = {"","","","","","","","",""};
        String[] objQ = getNameDisplay().split("");
        int restValidacao = 0;
        int coluna = 0;
        int digito = 0;
        int cont = 9;
        for (int i = 0; i < objQ.length; i++) {
            if (coluna <= 1){
                if (digito > 8){
                    System.out.println();
                    digito = 0;
                    d[digito] += objQ[i];
                }else {
                    d[digito] += objQ[i];
                }
                coluna ++;
            }else {
                if (digito > 8){
                    digito = 0;
                }
                d[digito] += objQ[i];
                coluna = 0;
                digito ++;
            }
        }
        for (int i = 0; i < d.length; i++) {

            for (int j = 0; j < digitosDisplay().size(); j++){
                if(d[i].equals(digitosDisplay().get(j))){
                    number += j;
                    restValidacao += j*(cont);
                    cont--;
                }
            }
        }
        if (restValidacao % 11 == 0) {
            return number;
        }else {
            return number + " ERR";
        }
    }
    private List<String> digitosDisplay(){
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
        return numeros;
    }

}
