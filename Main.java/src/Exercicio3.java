import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- ARMAZENAMENTO DO HISTÓRICO DE VENDAS--------");

        double bigger = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor da sua venda: ");
            double value = scanner.nextDouble();
            if (value > bigger) {
                bigger =  value;
            }
        }
        System.out.println("O maior valor é: " + bigger);

        scanner.close();
    }
}