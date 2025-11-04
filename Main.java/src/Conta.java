public class Conta {
    String number;
    double initialBalance;

        void creditar(double value) {
            initialBalance+=value;
            System.out.printf("\nDepósito realizado com sucesso e este é o saldo atual da sua conta: %.2f", initialBalance);
    }

        void debitar( double value) {
            initialBalance-=value;
             System.out.printf("\nSaque realizado com sucesso e este é o saldo atual da sua conta: %.2f", initialBalance);
    
    }

}
