package Aula5_EstruturasDeRepetição;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NI;
        int fatorial = 1;
        int i = 1;

        System.out.println("Digite um número inteiro positivo: ");
        NI = scanner.nextInt();

        if (NI <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");

        } else {
            System.out.print("Cálculo do fatorial (decrescente): ");

            do {
                fatorial = fatorial * NI;
                System.out.print(NI + " ");
                NI--;

            } while (NI >= 1);
            System.out.println();
        }

        System.out.println("O fatorial de " + NI +  " é: " + fatorial);

        scanner.close();
    }
}
