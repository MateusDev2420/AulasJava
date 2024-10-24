package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        while (idade < 18) {
            System.out.println("Digite sua idade ");
            idade = scanner.nextInt();
            System.out.println(idade);
        }
        System.out.println("Você é maior de idade");
        scanner.close();
    }
}
