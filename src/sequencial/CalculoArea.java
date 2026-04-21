package sequencial;

import java.util.Scanner;

public class CalculoArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        // Cálculo
        double area = largura * altura;

        // Formatação com printf
        System.out.printf("Área = %.2f%n", area);

        sc.close();
    }
}