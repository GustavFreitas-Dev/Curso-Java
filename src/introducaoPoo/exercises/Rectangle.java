package introducaoPoo.exercises;

public class Rectangle {

    // Atributos (dados do objeto)
    double width;
    double height;

    // Método que calcula a área
    public double area(){
        return width * height;
    }

    // Método que calcula o perímetro
    public double perimeter(){
        return 2 * (width + height);
    }

    // Método que calcula a diagonal (Teorema de Pitágoras)
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }

    // Método que exibe os resultados
    public void show(){

        // Aqui os métodos são chamados, então os cálculos acontecem agora
        System.out.printf("Area = %.2f%n", area());
        System.out.printf("Perimeter = %.2f%n", perimeter());
        System.out.printf("Diagonal = %.2f%n", diagonal());
    }
}