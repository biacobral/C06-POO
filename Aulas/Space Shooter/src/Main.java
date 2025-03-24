import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("Trator Voador", 100, "Explosivo");
        Nave nave2 = new Nave("Mochilinha", 100, "Normal");

        Asteroide asteroide1 = new Asteroide("Cometa", "Pequeno");
        Asteroide asteroide2 = new Asteroide("Rajada", "Grande");

        nave1.atirar(asteroide1, nave1);
        nave2.atirar(asteroide2, nave2);
    }
}