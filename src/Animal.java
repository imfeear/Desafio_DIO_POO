//abstração
abstract class Animal {

    private String nome; //encapsulamento

    public Animal(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public abstract void fazerSom();


    public void mover() {
        System.out.println("O animal está se movendo.");
    }
}
