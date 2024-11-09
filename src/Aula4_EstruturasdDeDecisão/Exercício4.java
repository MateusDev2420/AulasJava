package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vendas;
        Double comissão = 0.0;

        System.out.println("Digite o valor total de suas vendas: ");
        vendas = scanner.nextInt();

        if (vendas < 1000) {
            comissão = vendas * 0.05;
            System.out.println("Sua comissão será de: " + comissão);

        } else if (vendas >= 1000 && vendas <= 5000) {
            comissão = vendas * 0.10;
            System.out.println("Sua comissão será de: " + comissão);


        } else  {
                comissão = vendas * 0.15;
                System.out.println("Sua comissão será de: "  + comissão);


            }
            scanner.close();
        }
    }
