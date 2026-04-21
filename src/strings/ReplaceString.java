package strings;

public class ReplaceString {

    public static void main(String[] args) {

        String texto = "Java é difícil";

        // Troca palavra
        String resultado = texto.replace("difícil", "fácil");

        System.out.println(resultado);
    }
}