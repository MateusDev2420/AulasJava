package Exercícios;

import java.util.Scanner;

public class Exercício5_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;

        // Pede ao usuário a para digitar as notas

        System.out.println("Digite a nota da primeira prova: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite a nota da segunda Prova: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite a nota da terceira Prova: ");
        nota3 = scanner.nextInt();

        // Somas das notas
        int somaTotal = nota1 + nota2 + nota3;

        // Exibe o resultado
        System.out.println("A soma total das notas é: " + somaTotal);

        // Fecha o Scanner
        scanner.close();

    }
      }
