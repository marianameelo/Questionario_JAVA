public class Exercicio9 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.name = "Zeus";
        cachorro.race = "Labrador";
        cachorro.weight = 22.5;
        cachorro.age = 4;
    
        System.out.println("------  PET SHOP ------");

        cachorro.sobreCachorro();
        cachorro.latir();
        cachorro.dormir();
        
    }
}
