package Aula7_Funções;

public class Exemplo3 {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2, 3);
        System.out.println(retorno);

    }

    private static int funcaoComParametroComRetorno(int numero1, int numero2) {
        return numero1 + numero1;
    }
}
