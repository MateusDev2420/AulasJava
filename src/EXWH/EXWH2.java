package EXWH;

import java.util.Scanner;

public class EXWH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        int N;

        System.out.println("Digite um número N: ");
          N = scanner.nextInt();
        while (i <=N) {
            soma = soma + i;
            i++;
        }
    }
}
