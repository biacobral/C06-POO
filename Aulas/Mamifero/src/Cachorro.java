public class Cachorro extends Mamifero {

    Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au au au au au au");
    }
}
