public class Main {
    public static void main(String[] args) {

        Heroi heroi = new Heroi("Batman", 100);
        Vilao vilao = new Vilao("Coringa", 100);

        heroi.arma = new Arma[2];
        vilao.arma = new Arma[2];

        Arma batrangue = new Arma("Batrangue", 50, 2);
        Arma batgarra = new Arma("Batgarra", 20, 1);
        Arma flor = new Arma("Flor que espirra", 40, 4);
        Arma bomba = new Arma("Bomba", 80, 1);

        heroi.addArma(batrangue);
        heroi.addArma(batgarra);
        vilao.addArma(flor);
        vilao.addArma(bomba);

        System.out.println("\nArmas do " + heroi.getNome());
        heroi.mostrarArmas();

        System.out.println("\nArmas do " + vilao.getNome());
        vilao.mostrarArmas();

        System.out.println("\nCombate!!!");
        heroi.atacar(0, vilao); // Herói ataca primeiro
        vilao.atacar(1, heroi); // Vilão ataca depois

        System.out.println("\nUsando especiais:");
        heroi.usarEspecial(vilao);
        vilao.usarEspecial(heroi);

        // Estado final
        System.out.println("\nEstado Final:");
        System.out.println(heroi.getNome() + " - Vida: " + heroi.getVida());
        System.out.println(vilao.getNome() + " - Vida: " + vilao.getVida());
    }
}
