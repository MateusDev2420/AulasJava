package Aula5_EstruturasDeRepetição;

public class Exercício2 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i++;
        }
        System.out.println("O valor da soma dos numeros pares entre 1 a 100 é: " + soma);
    }
}





