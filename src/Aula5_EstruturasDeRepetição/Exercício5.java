package Aula5_EstruturasDeRepetição;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notas = 0;
        System.out.println("quais são as  notas?: ");

        for (int i = 1; i < 6; i++) {
            System.out.println("nota " + i + ": ");
            notas += scanner.nextInt();
        }
        System.out.println(" a media das notas é: " + notas / 5);
    }
}
