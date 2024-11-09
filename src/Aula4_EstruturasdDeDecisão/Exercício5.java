package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabalhadas, HorasExtras;
        double PagamentoHoraExtra, ValorHoraExtra, valorPorHora;

        System.out.println("Digite a quantidade de horas Trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor recebido por hora: ");
        valorPorHora = scanner.nextInt();

        if (horasTrabalhadas > 40) {
            HorasExtras = horasTrabalhadas - 40;
            ValorHoraExtra = valorPorHora * 1.5;
            PagamentoHoraExtra = HorasExtras * ValorHoraExtra;

            System.out.println("Você fez hora extras!");
            System.out.println("O valor a ser pago por essas horas será de: R$" + PagamentoHoraExtra);

        } else {
            System.out.println("Você não fez horas extras");
        }
        scanner.close();
    }
}

