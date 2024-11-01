package Aula4_EstruturasdDeDecisão.Exercícios;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da Compra R$ ");
        double valorCompra = scanner.nextDouble();

        double valorFinal;
        if (valorCompra >100) {
            valorFinal = valorCompra * 0.9;
            System.out.println("Parabéns!! Você ganhou 10% de desconto na sua compra.");

        }else{
            valorFinal = valorCompra;

        }
        System.out.println("O valor final a ser pago é: R$" + valorFinal);

        scanner.close();
    }
}
