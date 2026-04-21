package repetitivas;
import java.util.Scanner;
public class WhileScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = -1;

        // Continua até o usuário digitar 0
        while (numero != 0) {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("Programa encerrado.");

        sc.close();
    }
}
