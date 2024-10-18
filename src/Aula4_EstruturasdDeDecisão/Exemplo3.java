package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

             Scanner scanner = new Scanner(System.in);

             // Recebe a idade da pessoa
                   System.out.println("Digite sua idade: ");
               int idade = scanner.nextInt();

             // Classifica a Idade
               if (idade >= 0 && idade <= 12) {
                   System.out.println("Você é uma Criança");

             } else if (idade >= 13 && idade <=17) {
                   System.out.println("Você é um(a) Adolescente");

             } else if (idade >= 18 && idade <=64) {
                   System.out.println("Você é um Adulto(a)");

             } else if (idade >= 65) {
                   System.out.println("Você é um Idoso(a)");

             scanner.close();

             }
             }
             }

