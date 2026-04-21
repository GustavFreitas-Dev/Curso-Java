package introducaoPoo.apliccations;
import java.util.Scanner;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
        /*Esse aqui é um exercicio feito sem orientação a objetos para depois
        comparamos*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida do lado A do triangulo X:");
        double xA = sc.nextDouble();

        System.out.println("Digite a medida do lado B do triangulo X:");
        double xB = sc.nextDouble();

        System.out.println("Digite a medida do lado C do triangulo X:");
        double xC = sc.nextDouble();

        System.out.println("Digite a medida do lado A do triângulo Y:");
        double yA = sc.nextDouble();

        System.out.println("Digite a medida do lado B do triângulo Y:");
        double yB = sc.nextDouble();

        System.out.println("Digite a medida do lado C do triângulo Y:");
        double yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.00;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        p = (yA + yB + yC) / 2.00;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Area triângulo x é: %.4f%n", areaX);
        System.out.printf("Area triângulo y é: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A área maior é: X");
        } else{
            System.out.println("A área maior é: Y");
        }
        sc.close();
    }
}
