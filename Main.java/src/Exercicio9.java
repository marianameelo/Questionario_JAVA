public class Exercicio9 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Zeus";
        cachorro.raca = "Labrador";
        cachorro.peso = 22.5;
        cachorro.idade = 4;
    
        System.out.println("------  PET SHOP ------");

        cachorro.sobreCachorro();
        cachorro.latir();
        cachorro.dormir();
        
    }
}
