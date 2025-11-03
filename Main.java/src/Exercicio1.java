import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String name = scanner.nextLine();

        System.out.println("Olá " + name + "," + " qual a sua idade? ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Olá " + name + "." + "Você tem " + age + " anos e está apto para se matricular.");
        }
        else {
            System.out.println("Olá " + name + "." + " Você tem " + age + " anos e ainda não está apto para se matricular.");
        }
        scanner.close();
    }
}
