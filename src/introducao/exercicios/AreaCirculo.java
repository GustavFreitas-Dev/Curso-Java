package estruturasSequenciais.exercicios;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("Área = %.4f%n", area);

        sc.close();
    }
}
