public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    public Personagem() {
        arma = new Arma();
    }

    public void usarArma(){
        System.out.println("Usando arma...");
        arma.resistencia -= 2;
        arma.mostraInfoArma();

    }

    void tomarDano(){

        System.out.println("Tomando dano...");
        pontos -= 5;
        mostraInfoPersonagem();

    }

    void mostraInfoPersonagem(){
        System.out.println("========Infos do personagem========");
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Arma: " + arma.nome);
    }
}
