package EXWH;

import java.util.Scanner;

public class EXWH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int N;
        int soma = 0;

        System.out.println("Digite um número N: ");
        N = scanner.nextInt();

        while (i <= N) {
            soma = soma + i;
            i++;
        }
        System.out.println("A soma dos números de 1 a " + N + "   é = " + soma);
        scanner.close();

    }
}
