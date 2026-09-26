package com.example;
public class Main2 {
    public static void main(String[] args) {
        int n = 4;
        int resultado = multiplicador(n);
        System.out.println(resultado);
    }

    static int multiplicador (int n){
        return (n == 1) ?  1: n * juntos(n - 1);
    }

    
}
