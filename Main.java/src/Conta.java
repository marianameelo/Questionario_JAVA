public class Conta {
    String numero;
    double saldoInicial;

        void creditar(double valor) {
            saldoInicial+=valor;
            System.out.printf("\nDepósito realizado com sucesso e este é o saldo atual da sua conta: %.2f", saldoInicial);
    }

        void debitar( double valor) {
            saldoInicial-=valor;
             System.out.printf("\nSaque realizado com sucesso e este é o saldo atual da sua conta: %.2f", saldoInicial);
    
    }

}
