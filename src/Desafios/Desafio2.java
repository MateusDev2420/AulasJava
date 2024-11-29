package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                 __________________________________________
                |      Escolha uma opção:                  |
                |                                          |
                |          1 - Exibir Cadastro Completo    |
                |          2 - Exibir Cadastro Completo    |
                |          3 - Exibir Cadastro Completo    |
                |          4 - Exibir Cadastro Completo    |
                |          5 - Sair                        |
                |__________________________________________|                                        |
                """;
        do {
            System.out.println(menu);
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarrUsuario();
                    break;
                case 5:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }
            while (opcao != 5) ;


            public static void exibirUsuario () {
                System.out.println("Exibir");
            }

            public static void cadastrarUsuario () {
                System.out.println("Cadastrar");
            }

            public static void atualizarUsuario () {
                System.out.println("Atualizar");
            }

            public static void deletarrUsuario () {
                System.out.println("Deletar");
            }
        }

