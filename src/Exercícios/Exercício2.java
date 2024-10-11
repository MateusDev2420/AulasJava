package Exercícios;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int salário;
        int horasTrabalhadas;
        int valorPorHora;

        // Solicita e lê e quantidade de horas trabalhadas
        System.out.println("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = scanner.nextInt();

        // Solicita e lê o valor pago por hora
        System.out.println("Digite o valor pago pro hora");
        valorPorHora = scanner.nextInt();

        // Calcule o salário total

        int salario = horasTrabalhadas * valorPorHora;

        // Exibe resultado
        System.out.println("O salário total é " + salario);

        scanner.close();

    }
}
