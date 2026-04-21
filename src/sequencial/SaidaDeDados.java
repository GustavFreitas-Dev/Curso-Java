package estruturasSequenciais;

public class SaidaDeDados {
    public static void main(String[] args) {


        String produto = "Computador";
        int idade = 30;
        double preco = 2100.0;

        // Saída simples
        System.out.println("Produto: " + produto);

        // Saída formatada
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Preço: R$ %.2f%n", preco);

        // Múltiplos valores
        System.out.printf("%s custa R$ %.2f%n", produto, preco);
    }
}