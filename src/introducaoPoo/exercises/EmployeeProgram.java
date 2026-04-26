package introducaoPoo.exercises;

import java.util.Scanner;
import java.util.Locale;

public class EmployeeProgram {

    public static void main(String[] args) {

        // Define padrão de número (usa ponto decimal)
        Locale.setDefault(Locale.US);

        // Leitura de dados
        Scanner sc = new Scanner(System.in);

        // Cria objeto Employee
        Employee emp = new Employee();

        // Entrada de dados
        System.out.print("Name:");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        // Exibe dados do funcionário
        // (chama automaticamente o toString)
        System.out.println("Employee " + emp);

        System.out.println();

        // Solicita porcentagem de aumento
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        // Aplica aumento
        emp.increaseSalary(percentage);

        System.out.println();

        // Mostra dados atualizados
        System.out.println("Update data: " + emp);

        // Fecha o Scanner
        sc.close();
    }
}