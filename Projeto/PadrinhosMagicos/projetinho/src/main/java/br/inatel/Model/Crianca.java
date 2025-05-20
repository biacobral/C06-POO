package br.inatel.Model;

public class Crianca {
    private int idCrianca;
    private String nomeCrianca;
    private int idadeCrianca;
    private String sexoCrianca;
    private boolean temPadrinho;
    private String enderecoCrianca;

    public Crianca(int idCrianca, String nomeCrianca, int idadeCrianca, String sexoCrianca, boolean temPadrinho, String enderecoCrianca) {
        this.idCrianca = idCrianca;
        this.nomeCrianca = nomeCrianca;
        this.idadeCrianca = idadeCrianca;
        this.sexoCrianca = sexoCrianca;
        this.temPadrinho = temPadrinho;
        this.enderecoCrianca = enderecoCrianca;
    }

    public Crianca(String nomeCrianca, int idadeCrianca, String sexoCrianca, boolean temPadrinho, String enderecoCrianca) {
        this.nomeCrianca = nomeCrianca;
        this.idadeCrianca = idadeCrianca;
        this.sexoCrianca = sexoCrianca;
        this.temPadrinho = temPadrinho;
        this.enderecoCrianca = enderecoCrianca;
    }


}
