public class Exercicio6 {
    public static void main(String[] args) {
        Livro book1 = new Livro();
        book1.titulo = "Nem te conto";
        book1.autor = "Emily Henry";
        book1.ano = 2024; 

        System.out.println("------|Aqui estão as informações sobre os livros:|------" );
        System.out.printf("Livro: %s \nAutor(a): %s \nAno: %d \n", book1.titulo, book1.autor, book1.ano);
        System.out.println("-----------------------------------------");


        Livro book2 = new Livro();
        book2.titulo = "Orgulho e Preconceito";
        book2.autor = "Jane Austen";
        book2.ano = 1813;

        System.out.printf("Livro: %s \nAutor(a): %s \nAno: %d \n", book2.titulo, book2.autor, book2.ano);
        System.out.println("-----------------------------------------");

        Livro book3 = new Livro();
        book3.titulo = "O acordo";
        book3.autor = "Elle Kennedy";
        book3.ano = 2016;

        System.out.printf("Livro: %s \nAutor(a): %s \nAno: %d \n", book3.titulo, book3.autor, book3.ano);
        System.out.println("-----------------------------------------");
        
    }
}
