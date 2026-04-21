package introducao;

import java.util.Scanner; // Importa classe para leitura

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // cria objeto Scanner

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        // Saída
        System.out.println("\n--- Dados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        sc.close(); // fecha o Scanner
    }
}