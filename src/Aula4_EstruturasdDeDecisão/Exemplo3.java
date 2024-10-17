package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        // Solicita ao usuáro que digite a sua idade
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        // Determina a faixa etária
        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto.");
        } else if (idade >= 60) {
            System.out.println("Você é um idoso.");
        } else {
            System.out.println("Idade Inválida.");
        }

        // Fecha o scanner
        scanner.close();

        }
    }
}
