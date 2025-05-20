package br.inatel.Model;

public class Padrinhos {
    int idPadrinhos;
    String nomePadrinho;
    String tipoPadrinho;
    int Varinha_idSerial;
    int Crianca_idCrianca;

    public Padrinhos(int idPadrinhos, String nomePadrinho, String tipoPadrinho, int varinha_idSerial, int crianca_idCrianca) {
        this.idPadrinhos = idPadrinhos;
        this.nomePadrinho = nomePadrinho;
        this.tipoPadrinho = tipoPadrinho;
        Varinha_idSerial = varinha_idSerial;
        Crianca_idCrianca = crianca_idCrianca;
    }

    public Padrinhos(String nomePadrinho, String tipoPadrinho, int varinha_idSerial, int crianca_idCrianca) {
        this.nomePadrinho = nomePadrinho;
        this.tipoPadrinho = tipoPadrinho;
        Varinha_idSerial = varinha_idSerial;
        Crianca_idCrianca = crianca_idCrianca;
    }
}
