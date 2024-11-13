package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        double TaxaDolar = 5;
        double TaxaEuro = 6;
        double TaxaLibra = 7;

        double ValorReais;
        System.out.println("Digite o Valor Reais: ");
        ValorReais = scannner.nextDouble();

        System.out.println("Escolha uma opção de conversão: ");

        System.out.println("\t1 - Dolar");
        System.out.println("\t2 - Euro");
        System.out.println("\t3 - Libra");
        int ValorRecebido = scannner.nextInt();

        Double ValorConvertido;

        switch (ValorRecebido) {
            case 1:
                ValorConvertido = ValorReais/TaxaDolar;
                System.out.println("O seu Valor em Dólar será de: " + ValorConvertido + "USD.");
                break;
            case 2:
                ValorConvertido = ValorReais/TaxaEuro;
                System.out.println("O seu Valor em Euro será de: " + ValorConvertido + "€.");
                break;
            case 3:
                ValorConvertido = ValorReais/TaxaLibra;
                System.out.println("O seu Valor em Libra será de: " + ValorConvertido + "£");
                break;

            default:
                System.out.println("Opção Inválida!");
        }
scannner.close();

    }
}
