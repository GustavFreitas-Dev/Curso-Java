package introducaoPoo.application;
import java.util.Scanner;
import java.util.Locale;
import introducaoPoo.entities.Triangle;
public class ProgramPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Cria dois objetos da classe Triangle (instâncias)
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // Atribui valores aos atributos do objeto x
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();  // Atribui valores aos atributos do objeto y
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();  // Calcula a área do triângulo X e ychamando o metodo da classe
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc .close();
    }
}
