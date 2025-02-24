public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma(10,20);
        Arma arma2 = new Arma(15,20);
        Jogador jogador1 = new Jogador("Lambda", arma1, 200,100);
        Jogador jogador2 = new Jogador("Omega", arma2, 150,80);

        while(jogador1.vida>0 && jogador2.vida>0) {
            jogador1.atacar(jogador2);
            jogador2.atacar(jogador1);

            if (jogador1.vida<=0) {
                System.out.println(jogador1.nome + " morreu...");
                jogador1.vida = 0;
            }
            if (jogador2.vida<=0) {
                System.out.println(jogador2.nome + " morreu...");
                jogador2.vida = 0;
            }

            jogador1.mostraInfo();
            jogador2.mostraInfo();

        }
    }
}