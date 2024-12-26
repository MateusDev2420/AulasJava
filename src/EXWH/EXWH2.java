package EXWH;

import java.util.Scanner;

public class EXWH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int N;
        int soma = 0;

        System.out.println("Digite o valor de N");
        N = scanner.nextInt();

        while (i <= N){
            soma = soma + i;
            i++;
        }
        System.out.println("O resultado da soma entre o número 1 ao número N é = " + soma);
    }
}
