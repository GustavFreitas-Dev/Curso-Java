package introducaoPoo.exercises;

import java.util.Scanner;
import java.util.Locale;

public class RectangleProgram {

    public static void main(String[] args) {

        // Define padrão de número (usa ponto ao invés de vírgula)
        Locale.setDefault(Locale.US);

        // Cria objeto para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Cria um objeto da classe Rectangle
        Rectangle rectangle1 = new Rectangle();

        // Solicita entrada de dados
        System.out.println("Enter rectangle width and height:");

        // Atribui valores aos atributos do objeto
        rectangle1.width = sc.nextDouble();
        rectangle1.height = sc.nextDouble();

        // Chama o método que mostra os resultados
        // (esse método internamente calcula tudo na hora)
        rectangle1.show();

        // Fecha o Scanner
        sc.close();
    }
}