package Aula7_Funçoes;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        int dobro = dobrar(numero1);
        System.out.println("O dobro desse número é " + dobro);
    }

    static int dobrar(int num1) {
        return 2 * num1;
    }
}

