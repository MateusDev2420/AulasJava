package Aula6_Vetores_e_Matrizes;

public class Exemplo6 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1, 2, 3},
                {2, 4, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.println(matrizNumeros[i][j]);
            }
        }
        String[][] MatrizNomes = {{"Rafael, Gislene"}, {"Lara, Luana"}};
        for (int i = 0; i < MatrizNomes.length; i++) {
            for (int j = 0; j < MatrizNomes[i].length; j++) {
                System.out.println(MatrizNomes[i][j]);


            }
        }
    }
}
