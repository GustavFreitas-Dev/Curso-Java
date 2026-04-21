package estruturasSequenciais;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 9.0;
        double y = 2.0;
        double z = -5.0;

        // Raiz quadrada
        double raiz = Math.sqrt(x);
        System.out.println("Raiz quadrada de " + x + " = " + raiz);

        // Potência
        double potencia = Math.pow(x, y);
        System.out.println(x + " elevado a " + y + " = " + potencia);

        // Valor absoluto
        double absoluto = Math.abs(z);
        System.out.println("Valor absoluto de " + z + " = " + absoluto);

        // Máximo e mínimo
        double max = Math.max(x, y);
        double min = Math.min(x, y);
        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);

        // Arredondamento
        double valor = 3.75;
        System.out.println("Arredondado (round): " + Math.round(valor));
        System.out.println("Para cima (ceil): " + Math.ceil(valor));
        System.out.println("Para baixo (floor): " + Math.floor(valor));

        // Número aleatório (0.0 até 1.0)
        double aleatorio = Math.random();
        System.out.println("Número aleatório: " + aleatorio);

        // Aleatório entre 0 e 100
        int aleatorio100 = (int) (Math.random() * 100);
        System.out.println("Aleatório de 0 a 100: " + aleatorio100);
    }
}
