package condicionais;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int opcao = sc.nextInt();

        // Switch funciona bem para valores fixos
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu 1");
                break;

            case 2:
                System.out.println("Você escolheu 2");
                break;

            case 3:
                System.out.println("Você escolheu 3");
                break;

            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}