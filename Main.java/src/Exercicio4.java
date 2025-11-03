import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua primeira nota?");
        double noteOne = scanner.nextDouble();

        System.out.println("Qual sua segunda nota?");
        double noteTwo = scanner.nextDouble();

        System.out.println("Qual sua terceira nota?");
        double noteThree = scanner.nextDouble();

        double average = (noteOne + noteTwo + noteThree) / 3;

        if ( average >= 7) {
            System.out.printf("Você está aprovado e sua média é: %.1f\n ", average);
        }
        else {
            System.out.printf("Você está reprovado e sua média é: %.1f\n", average);
        }


        scanner.close();
    }
}
