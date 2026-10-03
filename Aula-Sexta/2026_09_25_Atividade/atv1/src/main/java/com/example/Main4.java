package com.example;

public class Main4 {
    public static int contarOcorrencias(int[] vetor, int indice, int procurado) {
    // Caso base: chegou ao final do vetor
    if (indice == vetor.length) {
        return 0;
    }

    // Verifica se o elemento atual é o número procurado
    if (vetor[indice] == procurado) {
        return 1 + contarOcorrencias(vetor, indice + 1, procurado);
    }

    return contarOcorrencias(vetor, indice + 1, procurado);
    }
    
    public static void main(String[] args) {
    int[] numeros = {2, 5, 2, 7, 2, 10};

    int resultado = contarOcorrencias(numeros, 0, 2);

    System.out.println("Resultado: " + resultado + " ocorrências");
}
}
