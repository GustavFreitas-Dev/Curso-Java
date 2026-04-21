package repetitivas;

public class WhilerBasico {
    public static void main(String[] args) {
        int contador = 0;

        // Executa enquanto a condição for verdadeira
        while (contador < 5) {
            System.out.println("Contador: " + contador);

            contador++; // evita loop infinito
        }
    }
}