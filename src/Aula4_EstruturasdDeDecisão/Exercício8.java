package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avaliacao;
        System.out.println("Digite a sua avalição em uma escala de 1 a 5: ");
        avaliacao = scanner.nextInt();

        switch (avaliacao) {
            case 1:
                System.out.println("Precisa melhorar!!");
                break;
            case 2:
                System.out.println("Você está abaixo da média!!");
                break;
            case 3:
                System.out.println("Tá na média!!");
                break;
            case 4:
                System.out.println("Você está acima da média!!");
                break;
            case 5:
                System.out.println("Excelente!!!");
                break;
            default:
                System.out.println("Número Inválido.");
        }
        scanner.close();

    }
}
