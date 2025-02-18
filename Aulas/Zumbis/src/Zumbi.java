public class Zumbi {
    double vida;
    String nome;

    public double mostraVida() {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        System.out.println("Transferindo vida para " + zumbiAlvo.nome + "...");
        zumbiAlvo.vida += quantia;
        System.out.println("Vida atual de " + zumbiAlvo.nome + ": " + mostraVida());
    }
}
