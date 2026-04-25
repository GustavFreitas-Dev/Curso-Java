package introducaoPoo.application;

// Importa a classe Product (entidade do sistema)
import introducaoPoo.entities.Product;

// Importa Scanner para entrada de dados
import java.util.Scanner;

// Importa Locale para padronizar ponto decimal
import java.util.Locale;

public class ProductProgram {

    public static void main(String[] args) {

        // Define padrão de números (usa ponto ao invés de vírgula)
        Locale.setDefault(Locale.US);

        // Objeto para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Cria um objeto Product
        Product product1 = new Product();

        System.out.println("Enter product data:");

        // Entrada do nome
        System.out.print("Name: ");
        product1.name = sc.nextLine();

        // Entrada do preço
        System.out.print("Price: ");
        product1.price = sc.nextDouble();

        // Entrada da quantidade
        System.out.print("Quantity in stock:");
        product1.quantity = sc.nextInt();

        // Exibe os dados do produto (usa toString automaticamente)
        System.out.println("Product data: " + product1);
        System.out.println();

        // Adiciona produtos ao estoque
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);

        // Mostra dados atualizados
        System.out.println("Update data: " + product1);
        System.out.println();

        // Remove produtos do estoque
        System.out.println("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);

        // Mostra dados finais
        System.out.println();
        System.out.println("Update data: " + product1);

        // Fecha o Scanner
        sc.close();
    }
}