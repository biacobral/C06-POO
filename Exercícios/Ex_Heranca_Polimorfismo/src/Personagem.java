public class Personagem {

    protected String nome;
    protected int vida;
    protected Arma[] arma;

    Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma){
        for(int i = 0; i < this.arma.length; i++) {
            if (this.arma[i] == null) {
                this.arma[i] = arma;
                break;
            }
        }
    }

    public void mostrarArmas(){
        for(int i = 0; i<arma.length; i++){
            if(arma[i] != null){
                System.out.println(arma[i]);
            }
            else System.out.println("Nada");
        }
    }

    public void atacar(int posicao, Personagem personagem){
        arma = personagem.getArma();
        if(arma[posicao].getDurabilidade() > 0){
            if(personagem.vida > 0){
                personagem.vida-= arma[posicao].getDano();
                arma[posicao].setDurabilidade(0);
            }
            else System.out.println(personagem.nome + " já está derrotado!! Ataque não realizado...");
        }
        else System.out.println("Durabilidade da arma " + arma[posicao].getNome() + " insuficiente!");
    }


    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma[] getArma() {
        return arma;
    }

    public void setArma(Arma[] arma) {
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}
