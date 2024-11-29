package Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"Id", "Nome", "Telefone", "Email"};
        String[][] matrizcadastro = new String[qtdPessoas + 1][cabecalho.length];
        matrizcadastro[0] = cabecalho;

        for (int linhas = 1; linhas <= qtdPessoas; linhas++) {
            System.out.println("Preencha as informações a seguir: ");
            System.out.println("ID - " + linhas);
            matrizcadastro[linhas][0] = String.valueOf(linhas);
            System.out.print("Nome : ");
            matrizcadastro[linhas][1] = scanner.nextLine();
            System.out.print("Telefone : ");
            matrizcadastro[linhas][2] = scanner.nextLine();
            System.out.print("Email : ");
            matrizcadastro[linhas][3] = scanner.nextLine();
        }
        String tabela = "";
        for (String[] linhas : matrizcadastro) {
            for (int coluna = 0; coluna < matrizcadastro[0].length; coluna++) {
                tabela += linhas[coluna] + "\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);

    }
}
