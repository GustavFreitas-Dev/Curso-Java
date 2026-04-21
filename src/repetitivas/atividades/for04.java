package repetitivas.atividades;
import java.util.Scanner;
public class for04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num2 == 0){
                System.out.println("Divisão Impossível");
            } else {
                double div = num1/num2;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
