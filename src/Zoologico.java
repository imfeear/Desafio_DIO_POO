public class Zoologico {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mingau");

        cachorro.fazerSom();
        cachorro.mover();

        gato.fazerSom();
        gato.mover();
    }
}