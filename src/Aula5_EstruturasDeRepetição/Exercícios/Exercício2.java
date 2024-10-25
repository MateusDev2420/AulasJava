package Aula5_EstruturasDeRepetição.Exercícios;

public class Exercício2 {
    public static void main(String[] args) {


        int soma = 0;
        int numero = 2;

        while (numero <= 100) {
            soma += numero;
            numero += 2;
        }

        System.out.println("A soma dos número pares de 1 a 100 é: " + soma);


    }
}