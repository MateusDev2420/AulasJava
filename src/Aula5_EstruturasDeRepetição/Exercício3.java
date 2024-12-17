package Aula5_EstruturasDeRepetição;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int mult = num -1;


        System.out.println("Qual numero se quer o fatorial?: "  );
        System.out.println("Qual número você quer o fatorial?: ");
        num = scanner.nextInt();


        do {

            mult--;
            num = num * mult;
            num--;
            mult = num - 1;

            do {
                num = num * mult;
                mult--;
            } while (mult > 0);

        }while (num <= 1);
        System.out.println(num);
        System.out.println("O fatorial é " + num);


        scanner.close();
    }
}
