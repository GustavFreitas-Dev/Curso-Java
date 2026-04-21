package strings;

public class Trim {

    public static void main(String[] args) {

        String texto = "   Olá mundo   ";

        // Remove espaços do início e do fim
        String resultado = texto.trim();

        System.out.println("Original: [" + texto + "]");
        System.out.println("Sem espaços: [" + resultado + "]");
    }
}