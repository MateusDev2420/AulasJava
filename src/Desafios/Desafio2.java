import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"id", "nome", "telefone", "email"};
    static String[][] matrizCadastro = {{"", ""}};

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;

        String menu = """
                ________________________________________________
                |  ESCOLHA UMA OPÇÃO:                           |
                |       1 - EXIBIR CADASTRO COMPLETO            |
                |       2 - INSERIRIR NOVO USUÁRIO              |
                |       3 - ATUALIZAR CADASTRO POR ID           |
                |       4 - DELETAR CADASTRO POR ID             |
                |       5 - SAIR                                |
                |_______________________________________________|               
                
                """;

        int opcao;
        do {

            System.out.println(menu);
            opcao = scanner.nextInt();
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
                    deletarUsuario();
                    break;

                case 5:
                    System.out.println("_________FIM DO PROGRAMA__________");
                    break;

                default:
                    System.out.println("Opcão invalida!!!");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                int tamanhoColuna = colunas == 0 ? 5 : (colunas == 2? 10 : 25);
                tabela.append(String.format("%-"+ tamanhoColuna+"s|",  linhas[colunas]));

            }
            tabela.append("\n"); //PARA PULAR PRA PROXIMA LINHA
        }
        System.out.println(tabela);


    }

    private static void cadastrarUsuario() {

        System.out.println("quantas pessoas você deseja cadastrar: ");
        int qtPessoas = scanner.nextInt();
        scanner.nextLine();   // ISSO TA SERVINDO PRA CONSUMIR O \n

        String[][] novamatrizCadastro = new String[matrizCadastro.length + qtPessoas][cabecalho.length];

        for (int linha = 1; linha < matrizCadastro[0].length; linha++) {
            novamatrizCadastro[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }

        for (int linhas = matrizCadastro.length; linhas < novamatrizCadastro.length; linhas++) {
            System.out.print("Preencha as informações a seguir: ");
            System.out.println(cabecalho[0] + "-" + linhas);
            novamatrizCadastro[linhas][0] = String.valueOf(linhas);

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {

                System.out.println(cabecalho[coluna] + ": ");
                novamatrizCadastro[linhas][coluna] = scanner.nextLine();
            }

        }
        matrizCadastro = novamatrizCadastro;

    }

    public static void atualizarUsuario() {
        exibirUsuario();
        System.out.println("\nDigite o ID do usuário que deseja atualizar:");
        int idEscolhido = scanner.nextInt();

        System.out.println(cabecalho[0] + " - " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ":  ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuario();

    }

    public static void deletarUsuario() {
    }


}
