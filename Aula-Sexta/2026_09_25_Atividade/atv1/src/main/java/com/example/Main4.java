package com.example;

public class Main4 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 2, 7, 2, 10};

int resultado = contar(numeros, 0, 2);

System.out.println(resultado);
    }

    public static int contar(int [] numeros, int indice, int procurado) {
        if (indice == numeros.length){
            return 0;
        } 

        if (numeros[indice] == procurado){
            return 1 + contar (numeros, indice + 1, procurado);
        }

        return contar(numeros, indice + 1, procurado);
    }
}
