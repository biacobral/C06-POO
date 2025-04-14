public class Lontra extends Mamifero{
    Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ih ri ri");
    }
}
