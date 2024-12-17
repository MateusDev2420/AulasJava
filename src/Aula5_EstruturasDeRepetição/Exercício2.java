package Aula5_EstruturasDeRepetição;

public class Exercício2 {
    public static void main(String[] args) {

        int soma = 0;
        int numero = 0;

        while (numero <100) {
            numero = numero + 2;
            soma = soma + numero;
        }
        System.out.println("O valor da soma dos números pares entre 1 a 100 é: " + soma);

    }
}