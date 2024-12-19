package EXWH;

public class EXWH4 {
    public static void main(String[] args) {
        int i = 5;
        int multiplicador = 1;
        int resultado;

        while (multiplicador <= 10) {
            resultado = i * multiplicador;
            System.out.println(i + "X" + multiplicador +" = " + resultado);
            multiplicador ++;
        }
    }
}
