package Aula6_Vetores_e_Matrizes;

public class Exemplo4 {
    public static void main(String[] args) {
        int [][] matrizNumeros = {
                {1, 2, 3},
                {2, 4, 6},
                {7, 8, 9}

        };
        System.out.println("Valor da posição [2][1] = " +matrizNumeros[2][1]);

        String [][] matrizNomes = {{"Vieira, Mateus,"}, {"Lara", "Luana"}};

        System.out.println("Valor da posição [1][0] = "+matrizNomes[1][0]);

    }
}
