package strings;

public class ToLowerUpper {

    public static void main(String[] args) {

        String texto = "Java É Legal";

        // Converte tudo para minúsculo
        String minusculo = texto.toLowerCase();

        // Converte tudo para maiúsculo
        String maiusculo = texto.toUpperCase();

        System.out.println("Original: " + texto);
        System.out.println("Minúsculo: " + minusculo);
        System.out.println("Maiúsculo: " + maiusculo);
    }
}