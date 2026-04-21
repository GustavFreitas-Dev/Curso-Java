package repetitivas;
import java.util.Scanner;
public class WhileSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero;

        // Soma números até digitar 0
        System.out.print("Digite um número (0 para parar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;

            System.out.print("Digite outro número: ");
            numero = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
