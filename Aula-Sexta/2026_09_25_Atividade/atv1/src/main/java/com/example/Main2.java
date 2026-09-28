package com.example;
public class Main2 {
    public static void main(String[] args) {
        System.out.println(potencia(2,4));
    }

    static int potencia (int k, int n){
        //Condição de parada. Todo número elevado a 0 é 1.
        if (n == 0)
            return 1;
        else{
            int aux = potencia(k,n/2);
            if(n % 2 == 0)
                return aux * aux;
            else return aux * aux * k;
        }
    }
}

//Entender o codigo abaixo de acordo com o codigo acima.


 /*public static void main(String[] args) {
        int n = 4;
        int resultado = multiplicador(n);
        System.out.println(resultado);
    }

    static int multiplicador (int n){
        return (n == 1) ?  1: n * multiplicador(n - 1);
    }*/