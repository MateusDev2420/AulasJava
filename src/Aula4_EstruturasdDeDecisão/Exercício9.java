package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horário;
        System.out.println("Digite o horário atual: ");
        horário = scanner.nextInt();

        if (horário >= 5 && horário < 12) {
            System.out.println("Agora são " + horário + "hrs da Manhã");

        } else if (horário >= 12 && horário < 18) {
            System.out.println("Agora são " + horário + "hrs da Tarde");

        } else if (horário >= 18 && horário < 22) {
            System.out.println("Agora são " + horário + "hrs da Noite");

        } else if (horário >= 22 && horário <= 23 || horário >= 0 && horário < 5) {
            System.out.println("Agora são " + horário + "hrs da Madrugada");

        } else {
            System.out.println("Número Inválido!! (O dia tem somente 24 horas");

        }
        scanner.close();
    }

}


