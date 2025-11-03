import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- ARMAZENAMENTO DO HISTÓRICO DE VENDAS--------");

        double maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor da sua venda: ");
            double valor = scanner.nextDouble();
            if (valor > maior) {
                maior =  valor;
            }
        }
        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}