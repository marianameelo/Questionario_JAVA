public class Cachorro {
    String nome;
    String raca;
    double peso;
    int idade;


    void sobreCachorro(){
        System.out.printf("O %s %s tem %.1f kg e %d anos de idade.", raca, nome, peso, idade );
    }

    void latir() {
        System.out.printf("\n%s latiu bastante no petshop", nome);
    }

    void dormir() {
        System.out.printf(" e depois %s acabou dormindo no caminho para casa.", nome);
    }
}
