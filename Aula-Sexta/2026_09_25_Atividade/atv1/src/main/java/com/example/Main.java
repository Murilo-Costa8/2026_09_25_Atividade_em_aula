package com.example;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int resultado = soma(n);
        System.out.println(resultado);
    }

    static int soma (int n){
        return (n == 0) ?  0: n + soma(n - 1);
    }
}