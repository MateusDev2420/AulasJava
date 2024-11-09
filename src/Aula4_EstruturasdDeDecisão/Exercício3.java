package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t1- Eletrônicos");
        System.out.println("\t2- Alimentos");
        System.out.println("\t3- Vestuário");


        System.out.println("Digite o número do departamento que você deseja acessar: ");
        int produto = scanner.nextInt();

        switch (produto) {

            case 1:
                System.out.println("Seja Bem Vindo a nossa área de Eletrônicos!");
                break;

            case 2:
                System.out.println("Seja Bem Vindo a nossa área de Alimentos!");
                break;

            case 3:
                System.out.println("Seja Bem Vindo a nossa área de Vestuários!");
                break;

            default:
                System.out.println("Código Inválido");

        }
        scanner.close();
    }
}
