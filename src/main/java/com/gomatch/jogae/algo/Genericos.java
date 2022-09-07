package com.gomatch.jogae.algo;

public class Genericos {
    int calculaDigitos(int value){
        int result = 1;
        if(value >= 10){
            value = value/10;
            result += calculaDigitos(value);
        };
        return result;
    }
    public int calculaHype(int rank){
        int biased = 0;
        {
            int digest = 0;
            if (rank >= 1 && rank <= 10) digest = biased * 3;
            else if (rank >= 11 && rank <= 50) digest = biased * 2;
            else if (rank >= 51 && rank <= 99) digest = biased * 1;
            else digest = biased * 0;
            return digest;
        }
    }
    public double gerarNumMatch(int value, int biased){
        double matchValue = 0;
        int digits = 0;
        if(biased != 0){
            value += biased;
            digits = calculaDigitos(value);
            System.out.println("Digitos: "+digits);
        }
        if(digits == 1) matchValue = value/10;
        else matchValue = value / Math.pow(10, digits);
        return matchValue;
    }
}
