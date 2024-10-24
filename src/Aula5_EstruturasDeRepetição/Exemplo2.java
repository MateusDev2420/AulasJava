package Aula5_EstruturasDeRepetição;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção");

            System.out.println("\t1 - para opção 1");
            System.out.println("\t2 - para opção 2");
            System.out.println("\t3 - para opção 3");
            System.out.println("\t4 - sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Parabéns! Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Parabéns! Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Parabéns! Você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Finish");
                    break;
                default:
                    System.out.println("Não tem mano");
            }
        }while (opcao !=4);
        System.out.println("Acabou!");

        scanner.close();
    }
}
