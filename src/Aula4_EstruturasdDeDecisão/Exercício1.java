package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        if (idade <= 18) {
            System.out.println("Acesso Permitido!");

        } else {
            System.out.println("Acesso Negado!");

        }
        scanner.close();
    }
}
