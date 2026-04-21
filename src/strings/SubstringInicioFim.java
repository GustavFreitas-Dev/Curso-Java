package strings;

public class SubstringInicioFim {

    public static void main(String[] args) {

        String texto = "Programacao";

        // Pega do índice 0 até 4 (não inclui o 4)
        String parte = texto.substring(0, 4);

        System.out.println(parte);
    }
}