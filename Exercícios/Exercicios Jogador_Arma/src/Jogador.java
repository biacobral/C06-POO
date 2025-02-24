public class Jogador {
    Arma arma;
    int energia;
    int vida;
    String nome;

    void atacar(Jogador alvo){
        System.out.println(nome + " atacou " + alvo.nome);
        if(energia>=arma.custoDeEnergia){
            alvo.vida -= arma.dano;
            energia -= arma.custoDeEnergia;
            System.out.println("Ataque bem sucedido...");
        }
        else{
            System.out.println("Energia insuficiente...");
        }
    }

    void mostraInfo(){
        System.out.println("===Infos do Jogador===");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);

        System.out.println("===Infos da Arma===");
        System.out.println("Dano: " + arma.dano);
        System.out.println("Custo: " + arma.custoDeEnergia);
    }

    public Jogador(String nome, Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
        this.nome = nome;
    }
}
