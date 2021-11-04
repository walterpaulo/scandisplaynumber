package br.com.unoseg.service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
//                    System.out.println();
                    digito = 0;
                    d[digito] += objQ[i];
                }else {
                    d[digito] += objQ[i];
                }
                coluna ++;
            }else {
//                if (digito > 8){
//                    digito = 0;
//                }
                d[digito] += objQ[i];
                coluna = 0;
                digito ++;
            }
        }
        boolean achei = true;
        for (int i = 0; i < d.length; i++) {
            if(!achei) {
                number += "?";
            }
            achei = false;
            for (int j = 0; j < digitosDisplay().size(); j++){
                Consumer<Boolean> pp = x -> System.out.print(x);
                Comparator<Boolean> comparator = (s, t1) -> s.compareTo(t1);

                if(d[i].equals(digitosDisplay().get(j))){
                    achei = true;
                    number += j;
                    restValidacao += j*(cont);
                    cont--;
                }
            }
        }
        if (number.contains("?")) {
            return number + " ILL";
        }else if (restValidacao % 11 == 0){
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
