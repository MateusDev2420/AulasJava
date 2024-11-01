package Aula4_EstruturasdDeDecisão.Exercícios;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabalhadas;
        double horasExtras;

        System.out.println("Digite a quantidade de horas Trabalhadas");
        horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas > 40) {
            horasExtras = horasTrabalhadas * 0.5;

        }
    }
}
