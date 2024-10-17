package Aula4_EstruturasdDeDecisão;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String corSemaforo;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a cor do semáforo: ");
        corSemaforo = scanner.next();


        System.out.println("");

        if(corSemaforo.equals ("Verde") || corSemaforo.equals("Verde")){
            System.out.println ("Siga!");

        }else if(corSemaforo.equals ("Amarelo") || corSemaforo.equals("Amarelo")){
            System.out.println ("Atenção!");

        } else if (corSemaforo.equals  ("Vermelho")|| corSemaforo.equals("Vermelho")) {
            System.out.println("Pare!");
        }else{

            System.out.println("Nunca vi semáforo com a cor " + corSemaforo);
        }
            scanner.close();


    }
}
