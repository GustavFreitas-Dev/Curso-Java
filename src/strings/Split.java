package strings;

public class Split {

    public static void main(String[] args) {

        String texto = "maçã banana laranja";

        // Divide a string em partes usando espaço
        String[] vetor = texto.split(" ");

        // Percorre o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}