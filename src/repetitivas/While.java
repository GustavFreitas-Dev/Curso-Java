package repetitivas;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;

        // Executa enquanto a condição for verdadeira
        while (numero != 0) {

            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            System.out.println("Você digitou: " + numero);
        }

        sc.close();
    }
}