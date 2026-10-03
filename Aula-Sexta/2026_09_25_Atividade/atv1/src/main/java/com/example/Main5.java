package com.example;

public class Main5 {
    public static int somaLinha(int[][] matriz, int linha, int coluna) {
    // Caso base: chegou ao final da linha
    if (coluna == matriz[linha].length) {
        return 0;
    }

    // Soma o elemento atual e chama o método para a próxima coluna
    return matriz[linha][coluna] + somaLinha(matriz, linha, coluna + 1);
    }

    public static void main(String[] args) {
    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int linha = 2;

    int resultado = somaLinha(matriz, linha, 0);

    System.out.println("Soma da linha " + linha + ": " + resultado);
}

}
