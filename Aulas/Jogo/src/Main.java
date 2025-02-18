import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem();

        personagem.nome = "Kratos";
        personagem.pontos = 100;

        personagem.arma.nome = "Lâminas";
        personagem.arma.resistencia = 100;
        personagem.arma.poder = 95;
        personagem.arma.descricao = "Lâminas altamente cortantes que somente " + personagem.nome + " pode utilizar!";

        personagem.arma.mostraInfoArma();
        personagem.mostraInfoPersonagem();

        personagem.usarArma();
        personagem.tomarDano();


    }
}