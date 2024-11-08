package Aula4_EstruturasdDeDecisão.Exercícios;

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NotaAluno;

        System.out.println("Para iniciarmos, digite a sua Nota: ");
        NotaAluno = scanner.nextInt();

        if (NotaAluno >= 7) {
            System.out.println("Parabéns, você foi aprovado!!");

        } else if (NotaAluno >= 5 && NotaAluno < 7) {
            System.out.println("Você está de recuperação");

        } else {

        }
    }
}





      
   

        
    



