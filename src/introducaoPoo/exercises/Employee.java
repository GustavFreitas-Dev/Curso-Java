package introducaoPoo.exercises;

public class Employee {
    public String name;

    // Salário bruto (antes de desconto)
    double grossSalary;

    // Imposto
    double tax;

    // Método que calcula o salário líquido
    public double netSalary(){
        // Salário líquido = salário bruto - imposto
        return grossSalary - tax;
    }

    // Método que aumenta o salário com base em uma porcentagem
    public void increaseSalary (double percentage){
        // Aumenta o salário bruto proporcionalmente
        grossSalary += grossSalary * percentage / 100.00;
    }

    // Método que define como o objeto será exibido (toString)
    public String toString(){
        // Mostra nome + salário líquido formatado com 2 casas decimais
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}