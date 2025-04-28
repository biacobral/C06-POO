public class Heroi extends Personagem implements Combater {

    Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        System.out.println(personagem.nome + " sendo especial");
        personagem.setArma(null);
    }
}
