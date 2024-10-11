public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    //(polimorfismo)
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está correndo.");
    }
}
