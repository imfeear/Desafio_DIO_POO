//herança
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome); // Chama o construtor da classe pai
    }

    //(polimorfismo)
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está miando: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está andando silenciosamente.");
    }
}
