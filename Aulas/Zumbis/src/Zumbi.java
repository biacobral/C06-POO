public class Zumbi {
    double vida;
    String nome;

    public double mostraVida() {
        System.out.print("Vida de " + nome + " ");
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida >= zumbiAlvo.vida && quantia <= vida ){
            System.out.println("Transferindo vida de " + nome + " para " + zumbiAlvo.nome + "...");
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;
        }
        else {
            return false;
        }
    }
}
