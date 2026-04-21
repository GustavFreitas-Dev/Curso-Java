package condicionais;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        // Estrutura condicional
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número é zero");
        }

        sc.close();
    }
}