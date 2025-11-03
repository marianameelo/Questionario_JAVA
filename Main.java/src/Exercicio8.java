public class Exercicio8 {
    public static void main(String[] args) {
        Conta contaPrincipal = new Conta();
        contaPrincipal.numero = "54678-2";
        contaPrincipal.saldoInicial = 155;
        String nome = "Alice Reis";
       
        System.out.printf("Nome: %s \nConta: %s \nSaldo da conta: %.2f " , nome, contaPrincipal.numero, contaPrincipal.saldoInicial);

        System.out.printf("\n-------------------------");
        contaPrincipal.creditar(75);

        System.out.printf("\n-------------------------");

        contaPrincipal.debitar(60);
    }
}
