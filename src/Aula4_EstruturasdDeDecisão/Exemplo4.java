package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String corSemaforo;
        System.out.println("Digite a cor do semáforo: ");
        corSemaforo = scanner.nextLine();

        switch (corSemaforo) {
            case "Verde":
                System.out.println("Siga!");
                break;
            case "Amarelo":
                System.out.println("Atenção!");
                break;
            case "Vermelho":
                System.out.println("Pare");
                break;
            default:
                System.out.println("Nunca vi semáforo com a cor" + corSemaforo);

                scanner.close();
        }
    }
}