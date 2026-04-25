package introducaoPoo.entities;

public class Product {

    // Atributos do produto
    public String name;
    public double price;
    public int quantity;

    // Calcula o valor total em estoque
    public double totalValueInStock () {
        return price * quantity;
    }

    // Adiciona produtos ao estoque
    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    // Remove produtos do estoque
    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    // Representação em texto do objeto
    public String toString(){
        return name
                + ", $ " + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ " + totalValueInStock();
    }
}