public class Cachorro {
    String name;
    String race;
    double weight;
    int age;


    void sobreCachorro(){
        System.out.printf("O %s %s tem %.1f kg e %d anos de idade.", race, name, weight, age );
    }

    void latir() {
        System.out.printf("\n%s latiu bastante no petshop", name);
    }

    void dormir() {
        System.out.printf(" e depois %s acabou dormindo no caminho para casa.", name);
    }
}
