public class Vilao extends Personagem implements Combater{

    Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        System.out.println(personagem.nome + " sendo especial");
        personagem.setVida(0);
    }
}
