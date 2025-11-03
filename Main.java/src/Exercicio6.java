public class Exercicio6 {
    public static void main(String[] args) {
        Livro book1 = new Livro();
        book1.title = "Nem te conto";
        book1.author = "Emily Henry";
        book1.year = 2024; 

        System.out.println("------|Aqui estão as informações sobre os livros:|------" );
        System.out.printf("Livro: %s \nauthor(a): %s \nyear: %d \n", book1.title, book1.author, book1.year);
        System.out.println("-----------------------------------------");


        Livro book2 = new Livro();
        book2.title = "Orgulho e Preconceito";
        book2.author = "Jane Austen";
        book2.year = 1813;

        System.out.printf("Livro: %s \nauthor(a): %s \nyear: %d \n", book2.title, book2.author, book2.year);
        System.out.println("-----------------------------------------");

        Livro book3 = new Livro();
        book3.title = "O acordo";
        book3.author = "Elle Kennedy";
        book3.year = 2016;

        System.out.printf("Livro: %s \nauthor(a): %s \nyear: %d \n", book3.title, book3.author, book3.year);
        System.out.println("-----------------------------------------");
        
    }
}
