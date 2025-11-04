public class Exercicio7 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.description = "Arroz Branco";
        produto1.value = 5.50;
        produto1.quantity = 60;
        
        System.out.println("----------|DISPONÍVEIS|----------");
        System.out.printf("Produto: %s \nvalue: %.2f \nquantity de arroz no estoque: %d \n" , produto1.description, produto1.value, produto1.quantity);
        System.out.println("____________________________________");

        Produto produto2 = new Produto();
        produto2.description = "Açúcar";
        produto2.value = 4.00;
        produto2.quantity = 55;

        System.out.printf("Produto: %s \nvalue: %.2f \nquantity de açúcar no estoque: %d \n", produto2.description, produto2.value, produto2.quantity);
        System.out.println("____________________________________");

        Produto produto3 = new Produto();
        produto3.description = "Sabão Líquido";
        produto3.value = 12.00;
        produto3.quantity = 43;

        System.out.printf("Produto: %s \nvalue: %.2f \nquantity de sabão de estoque: %d \n", produto3.description, produto3.value, produto3.quantity);
        System.out.println("____________________________________");

        int stockvalue = produto1.quantity + produto2.quantity + produto3.quantity;
        
        System.out.println("          VALOR TOTAL DO ESTOQUE");
        System.out.println(stockvalue);
    }
}
