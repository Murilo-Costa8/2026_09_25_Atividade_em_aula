package com.example;

public class Main3 {

    //int [] vetor = {2, 4, 6, 8, 10};

    //boolean resultado = vetores(vetor, 0);

    //System.out.println(resultado);

    public static boolean vetores(int [] vetor, int posicao) {
        //Condição de parada. Caso chegue na ultima casa: vai ter 5 casas, porem cmç no 0 ent isso esta dizendo q quando chegar na quinta casa o script vai subtrair 1 e parar.
        if (posicao == vetor.length - 1){
            return true;
        }

        //Verifica se esta fora de ordem. No caso, o elemento atual do vetor é menor ou igual ao próximo elemento?
        if (vetor[posicao] > vetor[posicao+1]) {
            return false;
        }

        //chamada recursiva
        return vetores(vetor, posicao + 1);
    }

    public static void main(String[] args) {
        //primeiro exemplo
        int[] vetor1 = {2,4,6,8,10};

        //segundo exemplo
        int[] vetor2 = {2,7,4,8,3};

        //chamando o metodo
        boolean resultado1 = vetores(vetor1, 0);

        boolean resultado2 = vetores(vetor2, 0);

        //Resultados na tela
        System.out.println("Exemplo 1: " + resultado1);
        System.out.println("Exemplo 2: " + resultado2);
    }
    
    
}
