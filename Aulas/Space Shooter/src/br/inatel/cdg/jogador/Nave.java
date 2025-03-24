package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;


    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public String getNome() {
        return nome;
    }

    public void atirar(Asteroide ast, Nave nave){
        if(tipoTiro=="Explosivo"){
            ast.destruir(nave);
        }
        else if(ast.getTipoAsteroide()=="Grande"){
            System.out.println("Não é possível destruir o asteroide " + ast.getNome() + " com a nave " + nome);
            ;
        }
        else ast.destruir(nave);


    }
}
