package Aula5_EstruturasDeRepetição;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int IP;
        boolean isPrimo = true;
        System.out.println("Digite um número inteiro positivo: ");
        IP = scanner.nextInt();

        if (IP <= 1) {
            System.out.println("O número precisa ser maior que 1.");

        } else {
            for (int i = 2; i < IP; i++) {
                if (IP % i == 0) ;
                isPrimo = false;
                break;
            }
            if (isPrimo = true) {
                System.out.println("O número " + IP + " é Primo!! ");

            } else {
                System.out.println("O número " + IP + " não é Primo!! ");

                scanner.close();
            }
        }
    }
}