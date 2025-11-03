import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numberOne = scanner.nextInt();

        System.out.println("Agora digite o segundo número:");
        int numberTwo = scanner.nextInt();

        System.out.println("Aqui estão o resultado das operações:");
        
        System.out.println("Soma: "  + (numberOne + numberTwo));
        System.out.println("Subtração: " + (numberOne - numberTwo));
        System.out.println("Multiplicação: " + (numberOne * numberTwo));

        if ( numberTwo != 0) {
            System.out.println("Divisão: " + (numberOne / numberTwo));
        }
        else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
