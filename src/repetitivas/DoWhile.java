package repetitivas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        // Executa pelo menos 1 vez
        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

        } while (numero != 0);

        sc.close();
    }
}