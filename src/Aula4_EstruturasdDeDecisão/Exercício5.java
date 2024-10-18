package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opção;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1- Para obter o Shape");
        System.out.println("\t2- Para o Corintihians ser Rebaixado");
        System.out.println("\t3- Para ter Sucesso");
        System.out.println("\t4- Para viajar a Europa");

        opção = scanner.nextInt();
        switch (opção){
            case 1:
                System.out.println("Vai Treinar Preguiçoso");
                break;
            case 2:
                System.out.println("Tem bom gosto pra Futebol");
                break;
            case 3:
                System.out.println("Deixa de ser Preguiçoso");
                break;
            case 4:
                System.out.println("Vai Estudar");
                break;

            default:
                System.out.println("É de 1 a 4 burro!");

                scanner.close();

        }

         }
    }

