package repetitivas.atividades;
import java.util.Scanner;
public class For05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= N; i++){
            fatorial *= i;

            if (N == 0){
                fatorial = 1;
                System.out.println(fatorial);
            }
        }
        System.out.println(fatorial);

        sc.close();
    }
}
