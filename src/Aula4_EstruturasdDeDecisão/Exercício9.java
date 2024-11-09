package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Horario;
        System.out.println("Digite o horário atual: ");
        Horario = scanner.nextDouble();

        if (Horario >= 5 && Horario <= 12) {
            System.out.println("Agora são " + Horario + "hrs da Manhã.");
        } else if (Horario > 12 && Horario <= 18) {
            System.out.println("Agora são " + Horario + "hrs da Tarde.");
        } else if (Horario > 18 && Horario <= 22) {
            System.out.println("Agora são " + Horario + "hrs da Noite.");
        } else if ((Horario > 22 && Horario <= 23) || (Horario >=0 && Horario <5)) {
            System.out.println("Agora são " + Horario + "hrs da Madrugada.");

        } else {
            System.out.println("Esse horário não existe, (O dia tem somente 24horas");
        }
        scanner.close();
    }
}

