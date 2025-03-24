package br.inatel.cdg.inimigo;

import br.inatel.cdg.jogador.Nave;

public class Asteroide {

    String nome;
    String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;

    }

    public void destruir(Nave nave){
        System.out.println("Asteroide " + nome + " está sendo destruído por " + nave.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }
}
