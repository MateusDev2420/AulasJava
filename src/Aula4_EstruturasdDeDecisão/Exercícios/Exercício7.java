package Aula4_EstruturasdDeDecisão.Exercícios;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro valor");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        numero2 = scanner.nextInt();

        System.out.println("Escolha uma das opções abaixo para fazer a operação: ");
        System.out.println("\t1 - Soma");
        System.out.println("\t2 - Subtração");
        System.out.println("\t3 - Mutiplicação");
        System.out.println("\t4 - Divisão");

        switch (numero1) {
            case 1:
                System.out.println("O valor da soma é = " + numero1 + numero2 );

                break;






        }
    }
}
