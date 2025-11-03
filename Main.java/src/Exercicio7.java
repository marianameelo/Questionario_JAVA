public class Exercicio7 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.descricao = "Arroz Branco";
        produto1.valor = 5.50;
        produto1.quantidade = 60;
        
        System.out.println("----------|DISPONÍVEIS|----------");
        System.out.printf("Produto: %s \nValor: %.2f \nQuantidade de arroz no estoque: %d \n" , produto1.descricao, produto1.valor, produto1.quantidade);
        System.out.println("____________________________________");

        Produto produto2 = new Produto();
        produto2.descricao = "Açúcar";
        produto2.valor = 4.00;
        produto2.quantidade = 55;

        System.out.printf("Produto: %s \nValor: %.2f \nQuantidade de açúcar no estoque: %d \n", produto2.descricao, produto2.valor, produto2.quantidade);
        System.out.println("____________________________________");

        Produto produto3 = new Produto();
        produto3.descricao = "Sabão Líquido";
        produto3.valor = 12.00;
        produto3.quantidade = 43;

        System.out.printf("Produto: %s \nValor: %.2f \nQuantidade de sabão de estoque: %d \n", produto3.descricao, produto3.valor, produto3.quantidade);
        System.out.println("____________________________________");

        int valorestoque = produto1.quantidade + produto2.quantidade + produto3.quantidade;

        System.out.println("          VALOR TOTAL DO ESTOQUE");
        System.out.println(valorestoque);
    }
}
