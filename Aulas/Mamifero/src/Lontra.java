public class Lontra extends Mamifero implements Aquatico{
    Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ih ri ri");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadando...");
    }
}
