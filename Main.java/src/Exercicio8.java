public class Exercicio8 {
    public static void main(String[] args) {
        Conta contaPrincipal = new Conta();
        contaPrincipal.number = "54678-2";
        contaPrincipal.initialBalance = 155;
        String name = "Alice Reis";
       
        System.out.printf("Nome: %s \nConta: %s \nSaldo da conta: %.2f " , name, contaPrincipal.number, contaPrincipal.initialBalance);

        System.out.printf("\n-------------------------");
        contaPrincipal.creditar(75);

        System.out.printf("\n-------------------------");

        contaPrincipal.debitar(60);
    }
}
