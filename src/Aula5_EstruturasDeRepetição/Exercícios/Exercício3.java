package Aula5_EstruturasDeRepetição.Exercícios;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
            int fatorial = 1;
            int i;

            do {
                fatorial *= i--;

            } while (i > 1 );

            System.out.println("O fatorial de " + numero + " é: " + fatorial);

            scanner.close();
        }
    }

