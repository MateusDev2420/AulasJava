package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Digite um número inteiro: ");
        x = scanner.nextInt();
        if (x > 30) {

            System.out.println("O número é maior que trinta 30");

        } else {

            System.out.println("O número é menor que 30");
        }
    }
}
