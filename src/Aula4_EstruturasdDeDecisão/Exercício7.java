package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro valor:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        numero2 = scanner.nextInt();

        System.out.println("Escolha uma das opções abaixo para fazer a operação: ");
        System.out.println("\t1 - Soma");
        System.out.println("\t2 - Subtração");
        System.out.println("\t3 - Mutiplicação");
        System.out.println("\t4 - Divisão");

        int operações = scanner.nextInt();

        switch (operações) {
            case 1:
                System.out.println("O valor da soma é: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("O valor da subtração é:" + (numero1 - numero1));
                break;
            case 3:
                System.out.println("O valor da mutiplicação é: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("O valor da divisão é:" + (numero1 / numero2));
                break;

            default:
                System.out.println("Operação Inválida");

        }
        scanner.close();
    }
}
